package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Tea_cla;

public class Tea_claDAOImpl extends HibernateDaoSupport implements Tea_claDAO {
	// 添加老师与班级的连接
	public void add(Tea_cla tea_cla) {
		this.getHibernateTemplate().persist(tea_cla);
	}

	// 删除老师与班级的连接
	public void delete(Tea_cla tea_cla) {
		this.getHibernateTemplate().delete(tea_cla);
	}

	// 更新老师与班级的连接
	public void update(Tea_cla tea_cla) {
		this.getHibernateTemplate().update(tea_cla);
	}

	// 查询老师与班级的连接
	@SuppressWarnings("unchecked")
	public List<Tea_cla> queryAll() {
		return this.getHibernateTemplate().find("select t_c from Tea_cla t_c");
	}

	// 按ID查询老师与班级的连接
	@SuppressWarnings("unchecked")
	public Tea_cla queryByID(int id) {
		List<Tea_cla> cla_xiList = this.getHibernateTemplate().find(
				"select t_c from Tea_cla t_c where t_c.id=?", id);
		if (cla_xiList.size() > 0) {
			return cla_xiList.get(0);
		} else {
			return cla_xiList.get(0);
		}
	}
	
	//按T_id查询老师与班级的连接
	public List<Tea_cla> queryAllByTid(int tea_id){
		List<Tea_cla> cla_xiList = this.getHibernateTemplate().find(
				"select t_c from Tea_cla t_c where t_c.tea_id=?", tea_id);
		if (cla_xiList.size() > 0) {
			return cla_xiList;
		} else {
			return cla_xiList;
		}
	}
	
	//按cla_id查询老师与班级的连接
	public List<Tea_cla> queryAllByCid(int cla_id){
		List<Tea_cla> cla_xiList = this.getHibernateTemplate().find(
				"select t_c from Tea_cla t_c where t_c.cla_id=?", cla_id);
		if (cla_xiList.size() > 0) {
			return cla_xiList;
		} else {
			return null;
		}
	}

}
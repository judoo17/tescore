package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Stu_cla;

public class Stu_claDAOImpl extends HibernateDaoSupport implements Stu_claDAO {
	// 添加学生与班级的关联
	public void add(Stu_cla stu_cla) {
		this.getHibernateTemplate().persist(stu_cla);
	}

	// 删除学生与班级的关联
	public void delete(Stu_cla stu_cla) {
		this.getHibernateTemplate().delete(stu_cla);
	}

	// 更新学生与班级的关联
	public void update(Stu_cla stu_cla) {
		this.getHibernateTemplate().update(stu_cla);
	}

	// 查询所有学生与班级的关联
	@SuppressWarnings("unchecked")
	public List<Stu_cla> queryAll() {
		return this.getHibernateTemplate().find("select s_c from Stu_cla s_c");
	}

	// 按ID查询学生与班级的关联
	@SuppressWarnings("unchecked")
	public Stu_cla queryByID(int id) {
		List<Stu_cla> stu_claList = this.getHibernateTemplate().find(
				"select s_c from Stu_cla s_c where s_c.id=?", id);
		if (stu_claList.size() > 0) {
			return stu_claList.get(0);
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Stu_cla queryByStu_id(int stu_id) {
		List<Stu_cla> stu_claList = this.getHibernateTemplate().find(
				"select s_c from Stu_cla s_c where s_c.stu_id=?", stu_id);
		if (stu_claList.size() > 0) {
			return stu_claList.get(0);
		} else {
			return null;
		}
	}

	public List<Stu_cla> queryByCla_id(int cla_id){
		List<Stu_cla> stu_claList = this.getHibernateTemplate().find(
				"select s_c from Stu_cla s_c where s_c.cla_id=?", cla_id);
		if (stu_claList.size() > 0) {
			return stu_claList;
		} else {
			return null;
		}
	}
}
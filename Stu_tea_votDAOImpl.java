package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Stu_tea_vot;

public class Stu_tea_votDAOImpl extends HibernateDaoSupport implements
		Stu_tea_votDAO {
	// 添加学生与教师和评教分数的关联
	public void add(Stu_tea_vot stu_tea_vot) {
		this.getHibernateTemplate().persist(stu_tea_vot);
	}

	// 删除学生与教师和评教分数的关联
	public void delete(Stu_tea_vot stu_tea_vot) {
		this.getHibernateTemplate().delete(stu_tea_vot);
	}

	// 更新学生与教师和评教分数的关联
	public void update(Stu_tea_vot stu_tea_vot) {
		this.getHibernateTemplate().update(stu_tea_vot);
	}

	// 查询所有学生与教师和评教分数的关联
	@SuppressWarnings("unchecked")
	public List<Stu_tea_vot> queryAll() {
		return this.getHibernateTemplate().find(
				"select s_t_v from Stu_tea_vot s_t_v");
	}

	// 按ID查询学生与教师和评教分数的关联
	@SuppressWarnings("unchecked")
	public Stu_tea_vot queryByID(int id) {
		List<Stu_tea_vot> stu_tea_votList = this.getHibernateTemplate().find(
				"select s_t_v from Stu_tea_vot s_t_v where s_t_v.id=?", id);
		if (stu_tea_votList.size() > 0) {
			return stu_tea_votList.get(0);
		} else {
			return null;
		}
	}

	public List<Stu_tea_vot> queryAllByTid(int tea_id) {
		List<Stu_tea_vot> cla_xiList = this.getHibernateTemplate().find(
				"select s_t_v from Stu_tea_vot s_t_v where s_t_v.tea_id=?", tea_id);
		if (cla_xiList.size() > 0) {
			return cla_xiList;
		} else {
			return cla_xiList;
		}
	}

	public List<Stu_tea_vot> queryAllBySid(int stu_id) {
		List<Stu_tea_vot> cla_xiList = this.getHibernateTemplate().find(
				"select s_t_v from Stu_tea_vot s_t_v where s_t_v.stu_id=?", stu_id);
		if (cla_xiList.size() > 0) {
			return cla_xiList;
		} else {
			return cla_xiList;
		}
	}
}
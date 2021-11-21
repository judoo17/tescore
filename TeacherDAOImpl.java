package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Teacher;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO {
	// 添加教师
	public void add(Teacher teacher) {
		this.getHibernateTemplate().persist(teacher);
	}

	// 删除教师
	public void delete(Teacher teacher) {
		this.getHibernateTemplate().delete(teacher);
	}

	// 更新教师
	public void update(Teacher teacher) {
		this.getHibernateTemplate().update(teacher);
	}

	// 查询所有教师
	@SuppressWarnings("unchecked")
	public List<Teacher> queryAll() {
		return this.getHibernateTemplate().find("select t from Teacher t");
	}

	// 按ID查询教师
	@SuppressWarnings("unchecked")
	public Teacher queryByID(int tea_id) {
		List<Teacher> teacherList = this.getHibernateTemplate().find(
				"select t from Teacher t where t.tea_id=?", tea_id);
		if (teacherList.size() > 0) {
			return teacherList.get(0);
		} else {
			return null;
		}
	}
	
	// 按账号查询教师
	public Teacher queryByTea_acc(String tea_acc){
		List<Teacher> teacherList = this.getHibernateTemplate().find(
				"select t from Teacher t where t.tea_acc=?", tea_acc);
		if (teacherList.size() > 0) {
			return teacherList.get(0);
		} else {
			return null;
		}
	}

}
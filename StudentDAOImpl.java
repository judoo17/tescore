package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Student;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO {
	// 添加学生
	public void add(Student student) {
		this.getHibernateTemplate().persist(student);
	}

	// 删除学生
	public void delete(Student student) {
		this.getHibernateTemplate().delete(student);
	}

	// 更新学生
	public void update(Student student) {
		this.getHibernateTemplate().update(student);
	}

	// 查询所有学生
	@SuppressWarnings("unchecked")
	public List<Student> queryAll() {
		return this.getHibernateTemplate().find("select s from Student s");
	}

	// 按ID查询学生
	@SuppressWarnings("unchecked")
	public Student queryByID(int stu_id) {
		List<Student> studentList = this.getHibernateTemplate().find(
				"select s from Student s where s.stu_id=?", stu_id);
		if (studentList.size() > 0) {
			return studentList.get(0);
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Student queryByNum(String stu_num){
		List<Student> studentList = this.getHibernateTemplate().find(
				"select s from Student s where s.stu_num=?", stu_num);
		if (studentList.size() > 0) {
			return studentList.get(0);
		} else {
			return null;
		}
	}

}
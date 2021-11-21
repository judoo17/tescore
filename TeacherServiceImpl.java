package com.teacher.service;

import java.util.List;

import com.teacher.dao.TeacherDAO;
import com.teacher.entity.Leader;
import com.teacher.entity.Teacher;

public class TeacherServiceImpl implements TeacherService {
	private TeacherDAO teacherDAO;

	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}

	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}

	// ��ӽ�ʦ
	public void add(Teacher teacher) {
		teacherDAO.add(teacher);
	}

	// ɾ���ʦ
	public void delete(Teacher teacher) {
		teacherDAO.delete(teacher);
	}

	// ���½�ʦ
	public void update(Teacher teacher) {
		teacherDAO.update(teacher);
	}

	// ��ѯ��ʦ
	public List<Teacher> queryAll() {
		return teacherDAO.queryAll();
	}

	// ��ID��ѯ��ʦ
	public Teacher queryByID(int tea_id) {
		return teacherDAO.queryByID(tea_id);
	}

	// 按账号查询教师
	public Teacher queryByTea_acc(String tea_acc) {
		return teacherDAO.queryByTea_acc(tea_acc);
	}

	public boolean loginTeacher(String tea_acc, String tea_password) {
		if (teacherDAO.queryByTea_acc(tea_acc) == null) {
			return false;
		} else {
			Teacher teacher = new Teacher();
			teacher = teacherDAO.queryByTea_acc(tea_acc);
			if (tea_password.equals(teacher.getTea_password())) {
				return true;
			} else {
				return false;
			}
		}
	}
}

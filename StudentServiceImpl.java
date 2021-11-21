package com.teacher.service;

import java.util.List;

import com.teacher.dao.StudentDAO;
import com.teacher.entity.Leader;
import com.teacher.entity.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDAO studentDAO;

	public StudentDAO getStudentDAO() {
		return studentDAO;
	}

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	// ���ѧ��
	public void add(Student student) {
		studentDAO.add(student);
	}

	// ɾ��ѧ��
	public void delete(Student student) {
		studentDAO.delete(student);
	}

	// ����ѧ��
	public void update(Student student) {
		studentDAO.update(student);
	}

	// ��ѯѧ��
	public List<Student> queryAll() {
		return studentDAO.queryAll();
	}

	// ��ID��ѯѧ��
	public Student queryByID(int stu_id) {
		return studentDAO.queryByID(stu_id);
	}

	public Student queryByNum(String stu_num) {
		return studentDAO.queryByNum(stu_num);
	}

	public boolean loginStudent(String stu_num, String stu_password) {
		if (studentDAO.queryByNum(stu_num) == null) {
			return false;
		} else {
			Student student = new Student();
			student = studentDAO.queryByNum(stu_num);
			if (stu_password.equals(student.getStu_password())) {
				return true;
			} else {
				return false;
			}
		}
	}
}

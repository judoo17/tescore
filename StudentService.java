package com.teacher.service;

import java.util.List;

import com.teacher.entity.Student;

public interface StudentService {
	// ���ѧ��
	public void add(Student student);

	// ɾ��ѧ��
	public void delete(Student student);

	// ����ѧ��
	public void update(Student student);

	// ��ѯѧ��
	public List<Student> queryAll();

	// ��ID��ѯѧ��
	public Student queryByID(int stu_id);
	
	public Student queryByNum(String stu_num);

	public boolean loginStudent(String stu_num,String stu_password);
}

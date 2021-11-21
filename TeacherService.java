package com.teacher.service;

import java.util.List;

import com.teacher.entity.Leader;
import com.teacher.entity.Teacher;

public interface TeacherService {
	// ��ӽ�ʦ
	public void add(Teacher teacher);

	// ɾ���ʦ
	public void delete(Teacher teacher);

	// ���½�ʦ
	public void update(Teacher teacher);

	// ��ѯ��ʦ
	public List<Teacher> queryAll();

	// ��ID��ѯ��ʦ
	public Teacher queryByID(int tea_id);
	
	// 按账号查询教师
	public Teacher queryByTea_acc(String tea_acc);
	
	public boolean loginTeacher(String tea_acc,String tea_password);
}

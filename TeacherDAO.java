package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Teacher;

public interface TeacherDAO {
	// 添加教师
	public void add(Teacher teacher);

	// 删除教师
	public void delete(Teacher teacher);

	// 更新教师
	public void update(Teacher teacher);

	// 查询教师
	public List<Teacher> queryAll();

	// 按ID查询教师
	public Teacher queryByID(int tea_id);
	
	// 按账号查询教师
	public Teacher queryByTea_acc(String tea_acc);

}

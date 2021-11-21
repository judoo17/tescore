package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Student;

public interface StudentDAO {
	// 添加学生
	public void add(Student student);

	// 删除学生
	public void delete(Student student);

	// 更新学生
	public void update(Student student);

	// 查询学生
	public List<Student> queryAll();

	// 按ID查询学生
	public Student queryByID(int stu_id);
	
	// 按学号查询学生
	public Student queryByNum(String stu_num);
	

}

package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Stu_tea_vot;

public interface Stu_tea_votDAO {
	// 添加学生与教师和评教分数的关联
	public void add(Stu_tea_vot stu_tea_vot);

	// 删除学生与教师和评教分数的关联
	public void delete(Stu_tea_vot stu_tea_vot);

	// 更新学生与教师和评教分数的关联
	public void update(Stu_tea_vot stu_tea_vot);

	// 查询学生与教师和评教分数的关联
	public List<Stu_tea_vot> queryAll();

	// 按ID查询学生与教师和评教分数的关联
	public Stu_tea_vot queryByID(int id);

	public List<Stu_tea_vot> queryAllByTid(int tea_id);
	
	public List<Stu_tea_vot> queryAllBySid(int stu_id);
}

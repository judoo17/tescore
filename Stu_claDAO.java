package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Stu_cla;

public interface Stu_claDAO {
	// 添加学生与班级的关联
	public void add(Stu_cla stu_cla);

	// 删除学生与班级的关联
	public void delete(Stu_cla stu_cla);

	// 更新学生与班级的关联
	public void update(Stu_cla stu_cla);

	// 查询学生与班级的关联
	public List<Stu_cla> queryAll();

	// 按ID查询学生与班级的关联
	public Stu_cla queryByID(int id);

	// 按学生查询学生与班级的关联
	public Stu_cla queryByStu_id(int stu_id);

	public List<Stu_cla> queryByCla_id(int cla_id);
}

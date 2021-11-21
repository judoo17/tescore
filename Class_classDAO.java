package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Class_class;

public interface Class_classDAO {
	// 添加班级
	public void add(Class_class class_class);

	// 删除班级
	public void delete(Class_class class_class);

	// 更新班级
	public void update(Class_class class_class);

	// 查找班级
	public List<Class_class> queryAll();

	// 按ID查询班级
	public Class_class queryByID(int cla_id);

	public List<Class_class> queryByX_id(int x_id);
}

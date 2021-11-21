package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Tea_cla;

public interface Tea_claDAO {
	// 添加老师与班级的连接
	public void add(Tea_cla tea_cla);

	// 删除老师与班级的连接
	public void delete(Tea_cla tea_cla);

	// 更新老师与班级的连接
	public void update(Tea_cla tea_cla);

	// 查询老师与班级的连接
	public List<Tea_cla> queryAll();

	// 按ID查询老师与班级的连接
	public Tea_cla queryByID(int id);
	
	//按tea_id查询老师与班级的连接
	public List<Tea_cla> queryAllByTid(int tea_id);
	
	//按cla_id查询老师与班级的连接
	public List<Tea_cla> queryAllByCid(int cla_id);

}

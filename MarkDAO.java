package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Mark;

public interface MarkDAO {
	// 添加记录
	public void add(Mark mark);

	// 删除记录
	public void delete(Mark mark);

	// 更新记录
	public void update(Mark mark);

	// 查询记录
	public List<Mark> queryAll();

	// 按ID查询记录
	public Mark queryByID(int mar_id);
	
	public List<Mark> queryAllByTid(int tea_id);
	
	public List<Mark> queryAllByCid(int cla_id);

}

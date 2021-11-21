package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Leader;

public interface LeaderDAO {
	// 添加领导
	public void add(Leader leader);

	// 删除领导
	public void delete(Leader leader);

	// 更新领导
	public void update(Leader leader);

	// 查询领导
	public List<Leader> queryAll();

	// 按ID查询领导
	public Leader queryByID(int lea_id);

	// 按账号查询领导
	public Leader queryByLea_acc(String lea_acc);
}

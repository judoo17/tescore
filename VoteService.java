package com.teacher.service;

import java.util.List;

import com.teacher.entity.Vote;

public interface VoteService {
	// 添加评教
	public void add(Vote vote);

	// 删除评教
	public void delete(Vote vote);

	// 更新评教
	public void update(Vote vote);

	// 查询评教
	public List<Vote> queryAll();

	// 按ID查询评教
	public Vote queryByID(int vot_id);

}

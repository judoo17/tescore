package com.teacher.service;

import java.util.List;

import com.teacher.dao.VoteDAO;
import com.teacher.entity.Vote;

public class VoteServiceImpl implements VoteService {
	private VoteDAO voteDAO;

	public VoteDAO getVoteDAO() {
		return voteDAO;
	}

	public void setVoteDAO(VoteDAO voteDAO) {
		this.voteDAO = voteDAO;
	}

	// 添加评教
	public void add(Vote vote) {
		voteDAO.add(vote);
	}

	// 删除评教
	public void delete(Vote vote) {
		voteDAO.delete(vote);
	}

	// 更新评教
	public void update(Vote vote) {
		voteDAO.update(vote);
	}

	// 查询评教
	public List<Vote> queryAll() {
		return voteDAO.queryAll();
	}

	// 按ID查询评教
	public Vote queryByID(int vot_id) {
		return voteDAO.queryByID(vot_id);
	}
}

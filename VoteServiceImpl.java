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

	// �������
	public void add(Vote vote) {
		voteDAO.add(vote);
	}

	// ɾ������
	public void delete(Vote vote) {
		voteDAO.delete(vote);
	}

	// ��������
	public void update(Vote vote) {
		voteDAO.update(vote);
	}

	// ��ѯ����
	public List<Vote> queryAll() {
		return voteDAO.queryAll();
	}

	// ��ID��ѯ����
	public Vote queryByID(int vot_id) {
		return voteDAO.queryByID(vot_id);
	}
}

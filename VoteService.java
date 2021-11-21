package com.teacher.service;

import java.util.List;

import com.teacher.entity.Vote;

public interface VoteService {
	// �������
	public void add(Vote vote);

	// ɾ������
	public void delete(Vote vote);

	// ��������
	public void update(Vote vote);

	// ��ѯ����
	public List<Vote> queryAll();

	// ��ID��ѯ����
	public Vote queryByID(int vot_id);

}

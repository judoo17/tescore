package com.teacher.service;

import java.util.List;

import com.teacher.entity.Mark;

public interface MarkService {
	// ��Ӽ�¼
	public void add(Mark mark);

	// ɾ���¼
	public void delete(Mark mark);

	// ���¼�¼
	public void update(Mark mark);

	// ��ѯ��¼
	public List<Mark> queryAll();

	// ��ID��ѯ��¼
	public Mark queryByID(int mar_id);

	public List<Mark> queryAllByTid(int tea_id);
	
	public List<Mark> queryAllByCid(int cla_id);

}

package com.teacher.service;

import java.util.List;

import com.teacher.dao.MarkDAO;
import com.teacher.entity.Mark;

public class MarkServiceImpl implements MarkService {
	private MarkDAO markDAO;

	public MarkDAO getMarkDAO() {
		return markDAO;
	}

	public void setMarkDAO(MarkDAO markDAO) {
		this.markDAO = markDAO;
	}

	// ��Ӽ�¼
	public void add(Mark mark) {
		markDAO.add(mark);
	}

	// ɾ���¼
	public void delete(Mark mark) {
		markDAO.delete(mark);
	}

	// ���¼�¼
	public void update(Mark mark) {
		markDAO.update(mark);
	}

	// ��ѯ��¼
	public List<Mark> queryAll() {
		return markDAO.queryAll();
	}

	// ��ID��ѯ��¼
	public Mark queryByID(int mar_id) {
		return markDAO.queryByID(mar_id);
	}

	public List<Mark> queryAllByTid(int tea_id) {
		return markDAO.queryAllByTid(tea_id);
	}

	public List<Mark> queryAllByCid(int cla_id) {
		return markDAO.queryAllByCid(cla_id);
	}

}

package com.teacher.service;

import java.util.List;

import com.teacher.dao.Stu_tea_votDAO;
import com.teacher.entity.Stu_tea_vot;

public class Stu_tea_votServiceImpl implements Stu_tea_votService {
	private Stu_tea_votDAO stu_tea_votDAO;

	public Stu_tea_votDAO getStu_tea_votDAO() {
		return stu_tea_votDAO;
	}

	public void setStu_tea_votDAO(Stu_tea_votDAO stuTeaVotDAO) {
		stu_tea_votDAO = stuTeaVotDAO;
	}

	// ���ѧ�����ʦ�����̷���Ĺ���
	public void add(Stu_tea_vot stu_tea_vot) {
		stu_tea_votDAO.add(stu_tea_vot);
	}

	// ɾ��ѧ�����ʦ�����̷���Ĺ���
	public void delete(Stu_tea_vot stu_tea_vot) {
		stu_tea_votDAO.delete(stu_tea_vot);
	}

	// ����ѧ�����ʦ�����̷���Ĺ���
	public void update(Stu_tea_vot stu_tea_vot) {
		stu_tea_votDAO.update(stu_tea_vot);
	}

	// ��ѯѧ�����ʦ�����̷���Ĺ���
	public List<Stu_tea_vot> queryAll() {
		return stu_tea_votDAO.queryAll();
	}

	// ��ID��ѯѧ�����ʦ�����̷���Ĺ���
	public Stu_tea_vot queryByID(int id) {
		return stu_tea_votDAO.queryByID(id);
	}

	public List<Stu_tea_vot> queryAllByTid(int tea_id) {
		return stu_tea_votDAO.queryAllByTid(tea_id);
	}

	public List<Stu_tea_vot> queryAllBySid(int stu_id) {
		return stu_tea_votDAO.queryAllBySid(stu_id);
	}
}

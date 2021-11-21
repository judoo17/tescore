package com.teacher.service;

import java.util.List;

import com.teacher.dao.Stu_claDAO;
import com.teacher.entity.Stu_cla;

public class Stu_claServiceImpl implements Stu_claService {
	private Stu_claDAO stu_claDAO;

	public Stu_claDAO getStu_claDAO() {
		return stu_claDAO;
	}

	public void setStu_claDAO(Stu_claDAO stuClaDAO) {
		stu_claDAO = stuClaDAO;
	}

	// ���ѧ����༶�Ĺ���
	public void add(Stu_cla stu_cla) {
		stu_claDAO.add(stu_cla);
	}

	// ɾ��ѧ����༶�Ĺ���
	public void delete(Stu_cla stu_cla) {
		stu_claDAO.delete(stu_cla);
	}

	// ����ѧ����༶�Ĺ���
	public void update(Stu_cla stu_cla) {
		stu_claDAO.update(stu_cla);
	}

	// ��ѯѧ����༶�Ĺ���
	public List<Stu_cla> queryAll() {
		return stu_claDAO.queryAll();
	}

	// ��ID��ѯѧ����༶�Ĺ���
	public Stu_cla queryByID(int id) {
		return stu_claDAO.queryByID(id);
	}

	// 按学生查询学生与班级的关联
	public Stu_cla queryByStu_id(int stu_id) {
		return stu_claDAO.queryByStu_id(stu_id);
	}

	public List<Stu_cla> queryByCla_id(int cla_id) {
		return stu_claDAO.queryByCla_id(cla_id);
	}
}

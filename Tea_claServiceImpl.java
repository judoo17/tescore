package com.teacher.service;

import java.util.List;

import com.teacher.dao.Tea_claDAO;
import com.teacher.entity.Tea_cla;

public class Tea_claServiceImpl implements Tea_claService {
	private Tea_claDAO tea_claDAO;

	public Tea_claDAO getTea_claDAO() {
		return tea_claDAO;
	}

	public void setTea_claDAO(Tea_claDAO teaClaDAO) {
		tea_claDAO = teaClaDAO;
	}

	// �����ʦ��༶������
	public void add(Tea_cla tea_cla) {
		tea_claDAO.add(tea_cla);
	}

	// ɾ����ʦ��༶������
	public void delete(Tea_cla tea_cla) {
		tea_claDAO.delete(tea_cla);
	}

	// ������ʦ��༶������
	public void update(Tea_cla tea_cla) {
		tea_claDAO.update(tea_cla);
	}

	// ��ѯ��ʦ��༶������
	public List<Tea_cla> queryAll() {
		return tea_claDAO.queryAll();
	}

	// ��ID��ѯ��ʦ��༶������
	public Tea_cla queryByID(int id) {
		return tea_claDAO.queryByID(id);
	}

	//按T_id查询老师与班级的连接
	public List<Tea_cla> queryAllByTid(int tea_id){
		return tea_claDAO.queryAllByTid(tea_id);
	}
	
	//按cla_id查询老师与班级的连接
	public List<Tea_cla> queryAllByCid(int cla_id){
		return tea_claDAO.queryAllByCid(cla_id);
	}
}

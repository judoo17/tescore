package com.teacher.service;

import java.util.List;

import com.teacher.entity.Tea_cla;

public interface Tea_claService {
	// �����ʦ��༶������
	public void add(Tea_cla tea_cla);

	// ɾ����ʦ��༶������
	public void delete(Tea_cla tea_cla);

	// ������ʦ��༶������
	public void update(Tea_cla tea_cla);

	// ��ѯ��ʦ��༶������
	public List<Tea_cla> queryAll();

	// ��ID��ѯ��ʦ��༶������
	public Tea_cla queryByID(int id);

	//按T_id查询老师与班级的连接
	public List<Tea_cla> queryAllByTid(int tea_id);
	
	//按cla_id查询老师与班级的连接
	public List<Tea_cla> queryAllByCid(int cla_id);
}

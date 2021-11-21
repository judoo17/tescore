package com.teacher.service;

import java.util.List;

import com.teacher.entity.Stu_cla;

public interface Stu_claService {
	// ���ѧ����༶�Ĺ���
	public void add(Stu_cla stu_cla);

	// ɾ��ѧ����༶�Ĺ���
	public void delete(Stu_cla stu_cla);

	// ����ѧ����༶�Ĺ���
	public void update(Stu_cla stu_cla);

	// ��ѯѧ����༶�Ĺ���
	public List<Stu_cla> queryAll();

	// ��ID��ѯѧ����༶�Ĺ���
	public Stu_cla queryByID(int id);
	
	// 按学生查询学生与班级的关联
	public Stu_cla queryByStu_id(int stu_id);
	
	public List<Stu_cla> queryByCla_id(int cla_id);

}

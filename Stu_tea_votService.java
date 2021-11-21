package com.teacher.service;

import java.util.List;

import com.teacher.entity.Stu_tea_vot;

public interface Stu_tea_votService {
	// ���ѧ�����ʦ�����̷���Ĺ���
	public void add(Stu_tea_vot stu_tea_vot);

	// ɾ��ѧ�����ʦ�����̷���Ĺ���
	public void delete(Stu_tea_vot stu_tea_vot);

	// ����ѧ�����ʦ�����̷���Ĺ���
	public void update(Stu_tea_vot stu_tea_vot);

	// ��ѯѧ�����ʦ�����̷���Ĺ���
	public List<Stu_tea_vot> queryAll();

	// ��ID��ѯѧ�����ʦ�����̷���Ĺ���
	public Stu_tea_vot queryByID(int id);

	public List<Stu_tea_vot> queryAllByTid(int tea_id);
	
	public List<Stu_tea_vot> queryAllBySid(int stu_id);
}

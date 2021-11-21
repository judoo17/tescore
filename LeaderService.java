package com.teacher.service;

import java.util.List;

import com.teacher.entity.Leader;

public interface LeaderService {
	// ����쵼
	public void add(Leader leader);

	// ɾ���쵼
	public void delete(Leader leader);

	// �����쵼
	public void update(Leader leader);

	// ��ѯ�쵼
	public List<Leader> queryAll();

	// ��ID��ѯ�쵼
	public Leader queryByID(int lea_id);
	
	public boolean loginLeader(String lea_acc,String lea_password);
	
	// 按账号查询领导
	public Leader queryByLea_acc(String lea_acc);

}

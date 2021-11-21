package com.teacher.service;

import java.util.List;

import com.teacher.dao.LeaderDAO;
import com.teacher.entity.Leader;

public class LeaderServiceImpl implements LeaderService {
	private LeaderDAO leaderDAO;

	public LeaderDAO getLeaderDAO() {
		return leaderDAO;
	}

	public void setLeaderDAO(LeaderDAO leaderDAO) {
		this.leaderDAO = leaderDAO;
	}

	// ����쵼
	public void add(Leader leader) {
		leaderDAO.add(leader);
	}

	// ɾ���쵼
	public void delete(Leader leader) {
		leaderDAO.delete(leader);
	}

	// �����쵼
	public void update(Leader leader) {
		leaderDAO.update(leader);
	}

	// ��ѯ�쵼
	public List<Leader> queryAll() {
		return leaderDAO.queryAll();
	}

	// ��ID��ѯ�쵼
	public Leader queryByID(int lea_id) {
		return leaderDAO.queryByID(lea_id);
	}

	public boolean loginLeader(String lea_acc,String lea_password){
		if(leaderDAO.queryByLea_acc(lea_acc)==null){
			return false;
		}else{
			Leader leader = new Leader();
			leader = leaderDAO.queryByLea_acc(lea_acc);
			if(lea_password.equals(leader.getLea_password())){
				return true;
			}else{
				return false;
			}
		}
	}
	
	// 按账号查询领导
	public Leader queryByLea_acc(String lea_acc){
		return leaderDAO.queryByLea_acc(lea_acc);
	}
}

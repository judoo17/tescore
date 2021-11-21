package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Leader;

public class LeaderDAOImpl extends HibernateDaoSupport implements LeaderDAO {
	// 添加领导
	public void add(Leader leader) {
		this.getHibernateTemplate().persist(leader);
	}

	// 删除领导
	public void delete(Leader leader) {
		this.getHibernateTemplate().delete(leader);
	}

	// 更新领导
	public void update(Leader leader) {
		this.getHibernateTemplate().update(leader);
	}

	// 查询所有领导
	@SuppressWarnings("unchecked")
	public List<Leader> queryAll() {
		return this.getHibernateTemplate().find("select l from Leader l");
	}

	// 按ID查询领导
	@SuppressWarnings("unchecked")
	public Leader queryByID(int lea_id) {
		List<Leader> leaderList = this.getHibernateTemplate().find(
				"select l from Leader l where l.lea_id=?", lea_id);
		if (leaderList.size() > 0) {
			return leaderList.get(0);
		} else {
			return null;
		}
	}
	
	// 按账号查询领导
	public Leader queryByLea_acc(String lea_acc){
		List<Leader> leaderList = this.getHibernateTemplate().find(
				"select l from Leader l where l.lea_acc=?", lea_acc);
		if (leaderList.size() > 0) {
			return leaderList.get(0);
		} else {
			return null;
		}
	}

}
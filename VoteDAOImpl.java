package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Vote;

public class VoteDAOImpl extends HibernateDaoSupport implements VoteDAO {
	// 添加评教
	public void add(Vote vote) {
		this.getHibernateTemplate().persist(vote);
	}

	// 删除评教
	public void delete(Vote vote) {
		this.getHibernateTemplate().delete(vote);
	}

	// 更新评教
	public void update(Vote vote) {
		this.getHibernateTemplate().update(vote);
	}

	// 查询所有评教
	@SuppressWarnings("unchecked")
	public List<Vote> queryAll() {
		return this.getHibernateTemplate().find("select v from Vote v");
	}

	// 按ID查询评教
	@SuppressWarnings("unchecked")
	public Vote queryByID(int vot_id) {
		List<Vote> voteList = this.getHibernateTemplate().find(
				"select v from Vote v where v.vot_id=?", vot_id);
		if (voteList.size() > 0) {
			return voteList.get(0);
		} else {
			return null;
		}
	}
}
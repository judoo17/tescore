package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Mark;

public class MarkDAOImpl extends HibernateDaoSupport implements MarkDAO {
	// 添加记录
	public void add(Mark mark) {
		this.getHibernateTemplate().persist(mark);
	}

	// 删除记录
	public void delete(Mark mark) {
		this.getHibernateTemplate().delete(mark);
	}

	// 更新记录
	public void update(Mark mark) {
		this.getHibernateTemplate().update(mark);
	}

	// 查询所有记录
	@SuppressWarnings("unchecked")
	public List<Mark> queryAll() {
		return this.getHibernateTemplate().find("select m from Mark m");
	}

	// 按ID查询记录
	@SuppressWarnings("unchecked")
	public Mark queryByID(int mar_id) {
		List<Mark> markList = this.getHibernateTemplate().find(
				"select m from Mark m where m.mar_id=?", mar_id);
		if (markList.size() > 0) {
			return markList.get(0);
		} else {
			return null;
		}
	}

	public List<Mark> queryAllByTid(int tea_id) {
		List<Mark> markList = this.getHibernateTemplate().find(
				"select m from Mark m where m.tea_id=?", tea_id);
		if (markList.size() > 0) {
			return markList;
		} else {
			return markList;
		}
	};

	public List<Mark> queryAllByCid(int cla_id) {
		List<Mark> markList = this.getHibernateTemplate().find(
				"select m from Mark m where m.cla_id=?", cla_id);
		if (markList.size() > 0) {
			return markList;
		} else {
			return markList;
		}
	}

}
package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Message;

public class MessageDAOImpl extends HibernateDaoSupport implements MessageDAO {
	// 添加记录
	public void add(Message message) {
		this.getHibernateTemplate().persist(message);
	}

	// 删除记录
	public void delete(Message message) {
		this.getHibernateTemplate().delete(message);
	}

	// 更新记录
	public void update(Message message) {
		this.getHibernateTemplate().update(message);
	}

	// 查询所有记录
	@SuppressWarnings("unchecked")
	public List<Message> queryAll() {
		return this.getHibernateTemplate().find("select m from Message m");
	}

	// 按ID查询记录
	@SuppressWarnings("unchecked")
	public Message queryByID(int id) {
		List<Message> messageList = this.getHibernateTemplate().find(
				"select m from Message m where m.id=?", id);
		if (messageList.size() > 0) {
			return messageList.get(0);
		} else {
			return null;
		}
	}

	public List<Message> queryAllByTid(int tea_id) {
		List<Message> messageList = this.getHibernateTemplate().find(
				"select m from Message m where m.tea_id=?", tea_id);
		if (messageList.size() > 0) {
			return messageList;
		} else {
			return messageList;
		}
	}

	public List<Message> queryAllByCid(int cla_id) {
		List<Message> messageList = this.getHibernateTemplate().find(
				"select m from Message m where m.cla_id=?", cla_id);
		if (messageList.size() > 0) {
			return messageList;
		} else {
			return messageList;
		}
	}

}
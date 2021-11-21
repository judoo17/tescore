package com.teacher.dao;

import java.util.List;

import com.teacher.entity.Message;

public interface MessageDAO {
	// 添加留言
	public void add(Message message);

	// 删除留言
	public void delete(Message message);

	// 更新留言
	public void update(Message message);

	// 查询留言
	public List<Message> queryAll();

	// 按ID查询留言
	public Message queryByID(int id);

	public List<Message> queryAllByTid(int tea_id);
	
	public List<Message> queryAllByCid(int cla_id);
}

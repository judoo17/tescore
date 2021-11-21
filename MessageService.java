package com.teacher.service;

import java.util.List;

import com.teacher.entity.Message;

public interface MessageService {
	// �������
	public void add(Message message);

	// ɾ������
	public void delete(Message message);

	// ��������
	public void update(Message message);

	// ��ѯ����
	public List<Message> queryAll();

	// ��ID��ѯ����
	public Message queryByID(int id);

	public List<Message> queryAllByTid(int tea_id);
	
	public List<Message> queryAllByCid(int cla_id);
}

package com.teacher.service;

import java.util.List;

import com.teacher.dao.MessageDAO;
import com.teacher.entity.Message;

public class MessageServiceImpl implements MessageService {
	private MessageDAO messageDAO;

	public MessageDAO getMessageDAO() {
		return messageDAO;
	}

	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	// �������
	public void add(Message message) {
		messageDAO.add(message);
	}

	// ɾ������
	public void delete(Message message) {
		messageDAO.delete(message);
	}

	// ��������
	public void update(Message message) {
		messageDAO.update(message);
	}

	// ��ѯ����
	public List<Message> queryAll() {
		return messageDAO.queryAll();
	}

	// ��ID��ѯ����
	public Message queryByID(int id) {
		return messageDAO.queryByID(id);
	}

	public List<Message> queryAllByTid(int tea_id) {
		return messageDAO.queryAllByTid(tea_id);
	}

	public List<Message> queryAllByCid(int cla_id) {
		return messageDAO.queryAllByCid(cla_id);
	}
}

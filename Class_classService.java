package com.teacher.service;

import java.util.List;

import com.teacher.entity.Class_class;

public interface Class_classService {
	// ��Ӱ༶
	public void add(Class_class class_class);

	// ɾ��༶
	public void delete(Class_class class_class);

	// ���°༶
	public void update(Class_class class_class);

	// ���Ұ༶
	public List<Class_class> queryAll();

	// ��ID��ѯ�༶
	public Class_class queryByID(int cla_id);

	public List<Class_class> queryByX_id(int x_id);
}

package com.teacher.service;

import java.util.List;

import com.teacher.dao.Class_classDAO;
import com.teacher.entity.Class_class;

public class Class_classServiceImpl implements Class_classService {
	private Class_classDAO class_classDAO;

	public Class_classDAO getClass_classDAO() {
		return class_classDAO;
	}

	public void setClass_classDAO(Class_classDAO classClassDAO) {
		class_classDAO = classClassDAO;
	}

	// ��Ӱ༶
	public void add(Class_class class_class) {
		class_classDAO.add(class_class);
	}

	// ɾ��༶
	public void delete(Class_class class_class) {
		class_classDAO.delete(class_class);
	}

	// ���°༶
	public void update(Class_class class_class) {
		class_classDAO.update(class_class);
	}

	// ���Ұ༶
	public List<Class_class> queryAll() {
		return class_classDAO.queryAll();
	}

	// ��ID��ѯ�༶
	public Class_class queryByID(int cla_id) {
		return class_classDAO.queryByID(cla_id);
	}

	public List<Class_class> queryByX_id(int x_id){
		return class_classDAO.queryByX_id(x_id);
	}
}

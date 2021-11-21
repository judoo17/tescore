package com.teacher.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.teacher.entity.Class_class;

public class Class_classDAOImpl extends HibernateDaoSupport implements
		Class_classDAO {
	// 娣诲姞瀛︾敓
	public void add(Class_class class_class) {
		this.getHibernateTemplate().persist(class_class);
	}

	// 鍒犻櫎瀛︾敓
	public void delete(Class_class class_class) {
		this.getHibernateTemplate().delete(class_class);
	}

	// 鏇存柊瀛︾敓
	public void update(Class_class class_class) {
		this.getHibernateTemplate().update(class_class);
	}

	// 鏌ヨ鎵�湁瀛︾敓
	@SuppressWarnings("unchecked")
	public List<Class_class> queryAll() {
		return this.getHibernateTemplate().find("select c from Class_class c");
	}

	// 鎸塈D鏌ヨ瀛︾敓
	@SuppressWarnings("unchecked")
	public Class_class queryByID(int cla_id) {
		List<Class_class> classList = this.getHibernateTemplate().find(
				"select c from Class_class c where c.cla_id=?", cla_id);
		if (classList.size() > 0) {
			return classList.get(0);
		} else {
			return null;
		}
	}
	
	public List<Class_class> queryByX_id(int x_id){
		List<Class_class> classList = this.getHibernateTemplate().find(
				"select c from Class_class c where c.x_id=?", x_id);
		if (classList.size() > 0) {
			return classList;
		} else {
			return classList;
		}
	}
}
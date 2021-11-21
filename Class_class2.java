package com.teacher.entity;

import javax.persistence.*;

@Entity
public class Class_class2 {
	private int cla_id;
	private String cla_name;
	private String x_name;

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public String getCla_name() {
		return cla_name;
	}

	public void setCla_name(String claName) {
		cla_name = claName;
	}

	public String getX_name() {
		return x_name;
	}

	public void setX_name(String xName) {
		x_name = xName;
	}

}

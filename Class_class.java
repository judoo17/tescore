package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "class_class")
public class Class_class {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cla_id;
	private String cla_name;
	private int x_id;

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

	public int getX_id() {
		return x_id;
	}

	public void setX_id(int xId) {
		x_id = xId;
	}
}

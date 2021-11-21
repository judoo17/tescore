package com.teacher.entity;

import javax.persistence.*;

@Entity
public class Tea_cla2 {

	private int id;
	private int tea_id;
	private String cla_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public String getCla_name() {
		return cla_name;
	}

	public void setCla_name(String claName) {
		cla_name = claName;
	}

}

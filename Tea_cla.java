package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "tea_cla")
public class Tea_cla {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int tea_id;
	private int cla_id;

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

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}
}

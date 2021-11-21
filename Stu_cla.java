package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "stu_cla")
public class Stu_cla {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int stu_id;
	private int cla_id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stuId) {
		stu_id = stuId;
	}
	public int getCla_id() {
		return cla_id;
	}
	public void setCla_id(int claId) {
		cla_id = claId;
	}
	
}

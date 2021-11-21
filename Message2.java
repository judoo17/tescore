package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message2 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int tea_id;
	private int stu_id;
	private int cla_id;
	private String message;
	private String stu_name;

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stuName) {
		stu_name = stuName;
	}

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

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}

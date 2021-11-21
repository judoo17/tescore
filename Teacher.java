package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tea_id;
	private String tea_name;
	private String tea_acc;
	private String tea_password;

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public String getTea_name() {
		return tea_name;
	}

	public void setTea_name(String teaName) {
		tea_name = teaName;
	}

	public String getTea_acc() {
		return tea_acc;
	}

	public void setTea_acc(String teaAcc) {
		tea_acc = teaAcc;
	}

	public String getTea_password() {
		return tea_password;
	}

	public void setTea_password(String teaPassword) {
		tea_password = teaPassword;
	}

}

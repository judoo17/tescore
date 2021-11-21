package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "stu_tea_vot")
public class Stu_tea_vot {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int stu_id;
	private int tea_id;
	private int vot_id;

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

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public int getVot_id() {
		return vot_id;
	}

	public void setVot_id(int votId) {
		vot_id = votId;
	}

}

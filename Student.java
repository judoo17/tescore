package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stu_id;
	private String stu_num;
	private String stu_password;
	private String stu_name;

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stuId) {
		stu_id = stuId;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stuNum) {
		stu_num = stuNum;
	}

	public String getStu_password() {
		return stu_password;
	}

	public void setStu_password(String stuPassword) {
		stu_password = stuPassword;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stuName) {
		stu_name = stuName;
	}
}

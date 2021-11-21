package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "leader")
public class Leader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lea_id;
	private String lea_acc;
	private String lea_password;
	private int lea_level;

	public int getLea_id() {
		return lea_id;
	}

	public void setLea_id(int leaId) {
		lea_id = leaId;
	}

	public String getLea_acc() {
		return lea_acc;
	}

	public void setLea_acc(String leaAcc) {
		lea_acc = leaAcc;
	}

	public String getLea_password() {
		return lea_password;
	}

	public void setLea_password(String leaPassword) {
		lea_password = leaPassword;
	}

	public int getLea_level() {
		return lea_level;
	}

	public void setLea_level(int leaLevel) {
		lea_level = leaLevel;
	}
}

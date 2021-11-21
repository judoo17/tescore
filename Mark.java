package com.teacher.entity;

import javax.persistence.*;

@Entity
@Table(name = "mark")
public class Mark {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mar_id;
	private int tea_id;
	private int cla_id;
	private double total;
	private int number;
	private double arg;

	public int getMar_id() {
		return mar_id;
	}

	public void setMar_id(int marId) {
		mar_id = marId;
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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getArg() {
		return arg;
	}

	public void setArg(double arg) {
		this.arg = arg;
	}
}

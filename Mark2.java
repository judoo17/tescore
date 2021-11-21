package com.teacher.entity;

import javax.persistence.*;

@Entity
public class Mark2 {

	private String tea_name;
	private String cla_name;
	private int cla_id;
	private int tea_id;
	private double total;
	private int number;
	private double arg;
	private int message_num;

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public int getMessage_num() {
		return message_num;
	}

	public void setMessage_num(int messageNum) {
		message_num = messageNum;
	}

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public String getTea_name() {
		return tea_name;
	}

	public void setTea_name(String teaName) {
		tea_name = teaName;
	}

	public String getCla_name() {
		return cla_name;
	}

	public void setCla_name(String claName) {
		cla_name = claName;
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

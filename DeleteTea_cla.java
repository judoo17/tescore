package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Tea_cla;
import com.teacher.service.Tea_claService;

@SuppressWarnings("serial")
public class DeleteTea_cla extends ActionSupport {
	private int id;
	private Tea_claService tea_claService;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Tea_claService getTea_claService() {
		return tea_claService;
	}

	public void setTea_claService(Tea_claService teaClaService) {
		tea_claService = teaClaService;
	}

	@SuppressWarnings("static-access")
	public String execute() throws Exception {
		Tea_cla tea_cla = new Tea_cla();
		tea_cla = tea_claService.queryByID(id);
		tea_claService.delete(tea_cla);
		return this.SUCCESS;
	}

}

package com.teacher.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Tea_cla;
import com.teacher.service.Tea_claService;

@SuppressWarnings("serial")
public class AddTea_cla extends ActionSupport {
	private int tea_id;
	private int cla_id;
	private Tea_claService tea_claService;

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

	public Tea_claService getTea_claService() {
		return tea_claService;
	}

	public void setTea_claService(Tea_claService teaClaService) {
		tea_claService = teaClaService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		Tea_cla tea_cla = new Tea_cla();
		tea_cla.setCla_id(cla_id);
		tea_cla.setTea_id(tea_id);
		tea_claService.add(tea_cla);
		request.setAttribute("tea", tea_id);
		return this.SUCCESS;
	}

}

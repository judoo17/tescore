package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Class_class;
import com.teacher.service.Class_classService;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

@SuppressWarnings("serial")
public class AddClass_class extends ActionSupport {
	private int cla_id;
	private String cla_name;
	private int x_id;
	private Class_classService class_classService;

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public String getCla_name() {
		return cla_name;
	}

	public void setCla_name(String claName) {
		cla_name = claName;
	}

	public int getX_id() {
		return x_id;
	}

	public void setX_id(int xId) {
		x_id = xId;
	}

	public Class_classService getClass_classService() {
		return class_classService;
	}

	public void setClass_classService(Class_classService classClassService) {
		class_classService = classClassService;
	}


	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		Class_class class_class = new Class_class();
		class_class.setCla_name(cla_name);
		class_class.setX_id(x_id);
		class_classService.add(class_class);
		return this.SUCCESS;
	}

}

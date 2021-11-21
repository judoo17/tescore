package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Class_class;
import com.teacher.service.Class_classService;

@SuppressWarnings("serial")
public class DeleteClass_class extends ActionSupport {
	private int cla_id;
	private Class_classService class_classService;

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public Class_classService getClass_classService() {
		return class_classService;
	}

	public void setClass_classService(Class_classService classClassService) {
		class_classService = classClassService;
	}

	@SuppressWarnings("static-access")
	public String execute() throws Exception {
		Class_class class_class = new Class_class();
		class_class = class_classService.queryByID(cla_id);
		class_classService.delete(class_class);
		return this.SUCCESS;
	}

}

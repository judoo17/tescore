package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Teacher;
import com.teacher.service.TeacherService;

@SuppressWarnings("serial")
public class AddTeacher extends ActionSupport {
	private String tea_name;
	private String tea_acc;
	private String tea_password;
	private TeacherService teacherService;

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

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		Teacher teacher = new Teacher();
		teacher.setTea_name(tea_name);
		teacher.setTea_acc(tea_acc);
		teacher.setTea_password(tea_password);
		teacherService.add(teacher);
		return this.SUCCESS;
	}

}

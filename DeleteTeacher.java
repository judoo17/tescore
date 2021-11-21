package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Teacher;
import com.teacher.service.TeacherService;

@SuppressWarnings("serial")
public class DeleteTeacher extends ActionSupport {
	private int tea_id;
	private TeacherService teacherService;

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@SuppressWarnings("static-access")
	public String execute() throws Exception {
		Teacher teacher = new Teacher();
		teacher = teacherService.queryByID(tea_id);
		teacherService.delete(teacher);
		return this.SUCCESS;
	}

}

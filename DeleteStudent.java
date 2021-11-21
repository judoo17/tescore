package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Stu_cla;
import com.teacher.entity.Student;
import com.teacher.service.Stu_claService;
import com.teacher.service.StudentService;

@SuppressWarnings("serial")
public class DeleteStudent extends ActionSupport {
	private int stu_id;
	private StudentService studentService;
	private Stu_claService stu_claService;

	public int getStu_id() {
		return stu_id;
	}

	public Stu_claService getStu_claService() {
		return stu_claService;
	}

	public void setStu_claService(Stu_claService stuClaService) {
		stu_claService = stuClaService;
	}

	public void setStu_id(int stuId) {
		stu_id = stuId;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@SuppressWarnings("static-access")
	public String execute() throws Exception {
		Student student = new Student();
		Stu_cla stu_cla = new Stu_cla();
		stu_cla = stu_claService.queryByStu_id(stu_id);
		student = studentService.queryByID(stu_id);
		studentService.delete(student);
		stu_claService.delete(stu_cla);
		return this.SUCCESS;
	}

}

package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Stu_cla;
import com.teacher.entity.Student;
import com.teacher.service.Stu_claService;
import com.teacher.service.StudentService;

@SuppressWarnings("serial")
public class AddStudent extends ActionSupport {
	private String stu_name;
	private String stu_num;
	private String stu_password;
	private int cla_id;
	private StudentService studentService;
	private Stu_claService stu_claService;

	public Stu_claService getStu_claService() {
		return stu_claService;
	}

	public void setStu_claService(Stu_claService stuClaService) {
		stu_claService = stuClaService;
	}

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public String getStu_name() {
		return stu_name;
	}

	public void setStu_name(String stuName) {
		stu_name = stuName;
	}

	public String getStu_num() {
		return stu_num;
	}

	public void setStu_num(String stuNum) {
		stu_num = stuNum;
	}

	public String getStu_password() {
		return stu_password;
	}

	public void setStu_password(String stuPassword) {
		stu_password = stuPassword;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		Student student = new Student();
		Stu_cla stu_cla = new Stu_cla();
		stu_cla.setCla_id(cla_id);
		student.setStu_name(stu_name);
		student.setStu_num(stu_num);
		student.setStu_password(stu_password);
		studentService.add(student);
		stu_cla.setStu_id(student.getStu_id());
		stu_claService.add(stu_cla);
		return this.SUCCESS;
	}

}

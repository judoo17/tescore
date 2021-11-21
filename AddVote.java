package com.teacher.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Class_class;
import com.teacher.entity.Message;
import com.teacher.entity.Stu_cla;
import com.teacher.entity.Stu_tea_vot;
import com.teacher.entity.Student;
import com.teacher.entity.Tea_cla;
import com.teacher.entity.Teacher;
import com.teacher.entity.Vote;
import com.teacher.service.Class_classService;
import com.teacher.service.MessageService;
import com.teacher.service.Stu_claService;
import com.teacher.service.Stu_tea_votService;
import com.teacher.service.Tea_claService;
import com.teacher.service.TeacherService;
import com.teacher.service.VoteService;

@SuppressWarnings("serial")
public class AddVote extends ActionSupport {
	private int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, total;
	private String message;
	private VoteService voteService;
	private MessageService messageService;
	private Stu_tea_votService stu_tea_votService;
	private Stu_claService stu_claService;
	private Class_classService class_classService;
	private Tea_claService tea_claService;
	private TeacherService teacherService;
	private int stu_id;
	private int cla_id;
	private int tea_id;
	private Teacher teacher;

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public Stu_tea_votService getStu_tea_votService() {
		return stu_tea_votService;
	}

	public void setStu_tea_votService(Stu_tea_votService stuTeaVotService) {
		stu_tea_votService = stuTeaVotService;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stuId) {
		stu_id = stuId;
	}

	public int getCla_id() {
		return cla_id;
	}

	public void setCla_id(int claId) {
		cla_id = claId;
	}

	public int getTea_id() {
		return tea_id;
	}

	public void setTea_id(int teaId) {
		tea_id = teaId;
	}

	public int getQ1() {
		return q1;
	}

	public void setQ1(int q1) {
		this.q1 = q1;
	}

	public int getQ2() {
		return q2;
	}

	public void setQ2(int q2) {
		this.q2 = q2;
	}

	public int getQ3() {
		return q3;
	}

	public void setQ3(int q3) {
		this.q3 = q3;
	}

	public int getQ4() {
		return q4;
	}

	public void setQ4(int q4) {
		this.q4 = q4;
	}

	public int getQ5() {
		return q5;
	}

	public void setQ5(int q5) {
		this.q5 = q5;
	}

	public int getQ6() {
		return q6;
	}

	public Stu_claService getStu_claService() {
		return stu_claService;
	}

	public void setStu_claService(Stu_claService stuClaService) {
		stu_claService = stuClaService;
	}

	public Class_classService getClass_classService() {
		return class_classService;
	}

	public void setClass_classService(Class_classService classClassService) {
		class_classService = classClassService;
	}

	public Tea_claService getTea_claService() {
		return tea_claService;
	}

	public void setTea_claService(Tea_claService teaClaService) {
		tea_claService = teaClaService;
	}

	public TeacherService getTeacherService() {
		return teacherService;
	}

	public void setTeacherService(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setQ6(int q6) {
		this.q6 = q6;
	}

	public int getQ7() {
		return q7;
	}

	public void setQ7(int q7) {
		this.q7 = q7;
	}

	public int getQ8() {
		return q8;
	}

	public void setQ8(int q8) {
		this.q8 = q8;
	}

	public int getQ9() {
		return q9;
	}

	public void setQ9(int q9) {
		this.q9 = q9;
	}

	public int getQ10() {
		return q10;
	}

	public void setQ10(int q10) {
		this.q10 = q10;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		System.out.println("***********************************stu"+stu_id);
		System.out.println("***********************************cla"+cla_id);
		System.out.println("***********************************tea"+tea_id);
		List<Stu_tea_vot> all = stu_tea_votService.queryAllBySid(stu_id);
		for (int i = 0; i < all.size(); i++) {
			if (tea_id == all.get(i).getTea_id()) {
				HttpServletRequest request = ServletActionContext.getRequest();
				Stu_cla stu_cla = new Stu_cla();
				stu_cla = stu_claService.queryByStu_id(stu_id);
				Class_class class_class = new Class_class();
				class_class = class_classService.queryByID(stu_cla.getCla_id());
				request.setAttribute("cla_name", class_class.getCla_name());
				request.setAttribute("cla_id", class_class.getCla_id());
				List<Tea_cla> alll = tea_claService.queryAllByCid(class_class
						.getCla_id());
				List<Teacher> allTeacher = new ArrayList<Teacher>();
				for (int j = 0; j < alll.size(); j++) {
					teacher = teacherService.queryByID(alll.get(j).getTea_id());
					allTeacher.add(j, teacher);
				}
				request.setAttribute("allTeacher", allTeacher);
				return this.ERROR;
			}
		}
		Vote vote = new Vote();
		if (message.equals(null)) {
			vote.setMessage("");
		} else {
			vote.setMessage(message);
		}
		vote.setQ1(q1);
		vote.setQ2(q2);
		vote.setQ3(q3);
		vote.setQ4(q4);
		vote.setQ5(q5);
		vote.setQ6(q6);
		vote.setQ7(q7);
		vote.setQ8(q8);
		vote.setQ9(q9);
		vote.setQ10(q10);
		vote.setTotal(q1 + q2 + q3 + q4 + q5 + q6 + q7 + q8 + q9 + q10);
		voteService.add(vote);
		Stu_tea_vot stu_tea_vot = new Stu_tea_vot();
		stu_tea_vot.setStu_id(stu_id);
		stu_tea_vot.setTea_id(tea_id);
		stu_tea_vot.setVot_id(vote.getVot_id());
		stu_tea_votService.add(stu_tea_vot);
		if (!message.equals("")) {
			Message message_ = new Message();
			message_.setCla_id(cla_id);
			message_.setStu_id(stu_id);
			message_.setTea_id(tea_id);
			message_.setMessage(message);
			messageService.add(message_);
		}
		HttpServletRequest request = ServletActionContext.getRequest();
		Stu_cla stu_cla = new Stu_cla();
		stu_cla = stu_claService.queryByStu_id(stu_id);
		Class_class class_class = new Class_class();
		class_class = class_classService.queryByID(stu_cla.getCla_id());
		request.setAttribute("cla_name", class_class.getCla_name());
		request.setAttribute("cla_id", class_class.getCla_id());
		List<Tea_cla> alll = tea_claService.queryAllByCid(class_class
				.getCla_id());
		List<Teacher> allTeacher = new ArrayList<Teacher>();
		for (int j = 0; j < alll.size(); j++) {
			teacher = teacherService.queryByID(alll.get(j).getTea_id());
			allTeacher.add(j, teacher);
		}
		request.setAttribute("allTeacher", allTeacher);
		return this.SUCCESS;
	}

}

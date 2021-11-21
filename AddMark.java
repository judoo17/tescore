package com.teacher.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Mark;
import com.teacher.entity.Stu_cla;
import com.teacher.entity.Stu_tea_vot;
import com.teacher.entity.Tea_cla;
import com.teacher.entity.Vote;
import com.teacher.service.MarkService;
import com.teacher.service.Stu_claService;
import com.teacher.service.Stu_tea_votService;
import com.teacher.service.Tea_claService;
import com.teacher.service.VoteService;

@SuppressWarnings("serial")
public class AddMark extends ActionSupport {
	private int tea_id;
	private int cla_id;
	private double total;
	private double arg;
	private Tea_claService tea_claService;
	private Stu_tea_votService stu_tea_votService;
	private Stu_claService stu_claService;
	private VoteService voteService;
	private MarkService markService;

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

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getArg() {
		return arg;
	}

	public void setArg(double arg) {
		this.arg = arg;
	}

	public Tea_claService getTea_claService() {
		return tea_claService;
	}

	public void setTea_claService(Tea_claService teaClaService) {
		tea_claService = teaClaService;
	}

	public Stu_tea_votService getStu_tea_votService() {
		return stu_tea_votService;
	}

	public void setStu_tea_votService(Stu_tea_votService stuTeaVotService) {
		stu_tea_votService = stuTeaVotService;
	}

	public Stu_claService getStu_claService() {
		return stu_claService;
	}

	public void setStu_claService(Stu_claService stuClaService) {
		stu_claService = stuClaService;
	}

	public VoteService getVoteService() {
		return voteService;
	}

	public void setVoteService(VoteService voteService) {
		this.voteService = voteService;
	}

	public MarkService getMarkService() {
		return markService;
	}

	public void setMarkService(MarkService markService) {
		this.markService = markService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		List<Tea_cla> all = tea_claService.queryAllByCid(cla_id);
		for (int i = 0; i < all.size(); i++) {
			List<Vote> allvote = new ArrayList<Vote>();
			tea_id = all.get(i).getTea_id();
			List<Stu_tea_vot> allVote = stu_tea_votService.queryAllByTid(all
					.get(i).getTea_id());
			for (int j = 0; j < allVote.size(); j++) {
				List<Stu_cla> allStudent = stu_claService.queryByCla_id(cla_id);
				for (int k = 0; k < allStudent.size(); k++) {
					if (allVote.get(j).getStu_id() == allStudent.get(k)
							.getStu_id()) {
						allvote.add(voteService.queryByID(allVote.get(j)
								.getVot_id()));
					}
				}
			}
			int ph = 0;
			total = 0;
			for (int z = 0; z < allvote.size(); z++) {
				total += allvote.get(z).getTotal();
				ph++;
			}
			arg = total / (double) allvote.size();
			Mark mark = new Mark();
			mark.setCla_id(cla_id);
			mark.setTea_id(tea_id);
			mark.setNumber(allvote.size());
			mark.setArg(arg);
			mark.setTotal(total);
			markService.add(mark);
		}
		return this.SUCCESS;
	}

}

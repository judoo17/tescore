package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Leader;
import com.teacher.service.LeaderService;

@SuppressWarnings("serial")
public class DeleteLeader extends ActionSupport {
	private int lea_id;
	private LeaderService leaderService;

	public int getLea_id() {
		return lea_id;
	}

	public void setLea_id(int leaId) {
		lea_id = leaId;
	}

	public LeaderService getLeaderService() {
		return leaderService;
	}

	public void setLeaderService(LeaderService leaderService) {
		this.leaderService = leaderService;
	}

	@SuppressWarnings("static-access")
	public String execute() throws Exception {
		Leader leader = new Leader();
		leader = leaderService.queryByID(lea_id);
		leaderService.delete(leader);
		return this.SUCCESS;
	}

}

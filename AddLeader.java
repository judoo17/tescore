package com.teacher.action;

import com.opensymphony.xwork2.ActionSupport;
import com.teacher.entity.Leader;
import com.teacher.service.LeaderService;

@SuppressWarnings("serial")
public class AddLeader extends ActionSupport {
	private String lea_acc;
	private String lea_password;
	private int lea_level;
	private LeaderService leaderService;

	public String getLea_acc() {
		return lea_acc;
	}

	public void setLea_acc(String leaAcc) {
		lea_acc = leaAcc;
	}

	public String getLea_password() {
		return lea_password;
	}

	public void setLea_password(String leaPassword) {
		lea_password = leaPassword;
	}

	public int getLea_level() {
		return lea_level;
	}

	public void setLea_level(int leaLevel) {
		lea_level = leaLevel;
	}

	public LeaderService getLeaderService() {
		return leaderService;
	}

	public void setLeaderService(LeaderService leaderService) {
		this.leaderService = leaderService;
	}

	@SuppressWarnings( { "static-access" })
	public String execute() throws Exception {
		Leader leader = new Leader();
		leader.setLea_acc(lea_acc);
		leader.setLea_password(lea_password);
		leader.setLea_level(lea_level);
		leaderService.add(leader);
		return this.SUCCESS;
	}

}

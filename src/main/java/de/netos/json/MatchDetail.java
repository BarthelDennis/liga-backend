package de.netos.json;

import java.util.ArrayList;
import java.util.List;

public class MatchDetail {
	
	private String nameTeam1;
	private String nameTeam2;
	private List<GoalDetail> goals = new ArrayList<>();
	
	public void addGoal(GoalDetail goalDetail) {
		goals.add(goalDetail);
	}
	
	public void setNameTeam1(String nameTeam1) {
		this.nameTeam1 = nameTeam1;
	}
	
	public void setNameTeam2(String nameTeam2) {
		this.nameTeam2 = nameTeam2;
	}
}

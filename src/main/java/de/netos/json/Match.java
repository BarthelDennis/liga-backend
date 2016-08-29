package de.netos.json;

public class Match {
	
	private String nameTeam1;
	private String nameTeam2;
	private String halftimeResult;
	private String endResult;
	private String iconTeam1;
	private String iconTeam2;
	private String matchID;
	
	public void setNameTeam1(String nameTeam1) {
		this.nameTeam1 = nameTeam1;
	}
	
	public void setNameTeam2(String nameTeam2) {
		this.nameTeam2 = nameTeam2;
	}
	
	public void setHalftimeResult(int goalsTeam1, int goalsTeam2) {
		this.halftimeResult = goalsTeam1 + ":" + goalsTeam2;
	}
	
	public void setEndResult(int goalsTeam1, int goalsTeam2) {
		this.endResult = goalsTeam1 + ":" + goalsTeam2;
	}
	
	public void setIconTeam1(String iconTeam1) {
		this.iconTeam1 = iconTeam1;
	}
	
	public void setIconTeam2(String iconTeam2) {
		this.iconTeam2 = iconTeam2;
	}
	
	public void setMatchID(String matchID) {
		this.matchID = matchID;
	}
}

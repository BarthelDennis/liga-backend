package de.netos;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;

import com.google.gson.Gson;

import de.netos.json.GoalDetail;
import de.netos.json.Match;
import de.netos.json.MatchDetail;
import de.netos.json.Matchday;
import de.netos.opendb.generated.ArrayOfGroup;
import de.netos.opendb.generated.ArrayOfMatchdata;
import de.netos.opendb.generated.Goal;
import de.netos.opendb.generated.Group;
import de.netos.opendb.generated.MatchResult;
import de.netos.opendb.generated.Matchdata;
import de.netos.opendb.generated.Sportsdata;
import de.netos.opendb.generated.SportsdataSoap;

@ApplicationScoped
public class LigaBackendConnector {
	
	private static final QName SERVICE_NAME = new QName("http://msiggi.de/Sportsdata/Webservices", "Sportsdata");
	
	private SportsdataSoap sportsdata;
	
	@PostConstruct
	void create() {
		Sportsdata data = new Sportsdata(Sportsdata.WSDL_LOCATION, SERVICE_NAME);
        sportsdata = data.getSportsdataSoap(); 
	}
	
	public String get(String day, String leagueShortcut, String leagueSaison) {
		ArrayOfMatchdata matchdata = sportsdata.getMatchdataByGroupLeagueSaison(Integer.parseInt(day), leagueShortcut, leagueSaison);
		
		List<Matchdata> matchdata2 = matchdata.getMatchdata();
		
		Matchday matchday = new Matchday();
		for (Matchdata matchdata3 : matchdata2) {
			Match match = new Match();
			match.setNameTeam1(matchdata3.getNameTeam1());
			match.setNameTeam2(matchdata3.getNameTeam2());
			match.setIconTeam1(matchdata3.getIconUrlTeam1());
			match.setIconTeam2(matchdata3.getIconUrlTeam2());
			match.setMatchID(Integer.toString(matchdata3.getMatchID()));
			
			Optional<MatchResult> halftimeResult = getResult(matchdata3, "Halbzeitergebnis");
			halftimeResult.ifPresent(e -> match.setHalftimeResult(e.getPointsTeam1(), e.getPointsTeam2()));
			
			Optional<MatchResult> endResult = getResult(matchdata3, "Endergebnis");
			endResult.ifPresent(e -> match.setEndResult(e.getPointsTeam1(), e.getPointsTeam2()));
			
			matchday.add(match);
		}
		
		String json = new Gson().toJson(matchday);
		
		return json;
	}
	
	public String getAllAvailableMatchdays(String leagueShortcut, String leagueSaison) {
		ArrayOfGroup availableGroups = sportsdata.getAvailGroups(leagueShortcut, leagueSaison);
		
		return new Gson().toJson(availableGroups);
	}
	
	public String getMatchdetail(int matchId) {
		Matchdata matchdata = sportsdata.getMatchByMatchID(matchId);
		
		MatchDetail matchDetail = new MatchDetail();
		
		int scoreTeam1 = 0;
		int scoreTeam2 = 0;
		
		for (Goal goal : matchdata.getGoals().getGoal()) {
			GoalDetail goalDetail = new GoalDetail();
			
			if (scoreTeam1 < goal.getGoalScoreTeam1()) {
				goalDetail.setHometeam(true);
				scoreTeam1 = goal.getGoalScoreTeam1();
			} else if (scoreTeam2 < goal.getGoalScoreTeam2()) {
				goalDetail.setHometeam(false);
				scoreTeam2 = goal.getGoalScoreTeam2();
			}
			
			goalDetail.setMinute(goal.getGoalMatchMinute());
			goalDetail.setGoalGetter(goal.getGoalGetterName());
			
			matchDetail.addGoal(goalDetail);
		}
		
		matchDetail.setNameTeam1(matchdata.getNameTeam1());
		matchDetail.setNameTeam2(matchdata.getNameTeam2());
		
		String json = new Gson().toJson(matchDetail);
		
		return json;
	}
	
	private Optional<MatchResult> getResult(Matchdata matchdata, String resultName) {
		return matchdata.getMatchResults().getMatchResult()
				.stream()
				.filter(e -> e.getResultName().equals(resultName))
				.findFirst();
	}
}

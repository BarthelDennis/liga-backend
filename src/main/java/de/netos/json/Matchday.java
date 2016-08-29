package de.netos.json;

import java.util.ArrayList;
import java.util.List;

public class Matchday {

	private List<Match> matches = new ArrayList<>();
	
	public void add(Match match) {
		matches.add(match);
	}
}

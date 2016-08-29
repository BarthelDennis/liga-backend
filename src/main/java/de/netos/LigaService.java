package de.netos;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/liga")
public class LigaService {
	
	@Inject
	private LigaBackendConnector backendConnector;
	
	@GET
	@Path("/matchday")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMatchday(@QueryParam("day") String day) {
		return backendConnector.get(day, "bl1", "2015");
	}
	
	@GET
	@Path("/availableMatchdays")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAvailableMatchday() {
		return backendConnector.getAllAvailableMatchdays("bl1", "2015");
	}
	
	@GET
	@Path("/matchdetail")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMatchdetail(@QueryParam("matchId") int matchId) {
		return backendConnector.getMatchdetail(matchId);
	}
}

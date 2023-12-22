package net.shares.fetcher;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import net.shares.share.Share;


@Path("/api/fetch")
public class Fetcher {
	@Inject FetchService fetchService;
	
	@GET
	@Path("/{identifier}")
	public String fetchShare(String Identifier){
		return fetchService.fetch(Identifier);
	}
	
}

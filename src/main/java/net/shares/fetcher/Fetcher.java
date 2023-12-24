package net.shares.fetcher;

import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import yahoofinance.Stock;


@Path("/api/fetch")
public class Fetcher {
	@Inject FetchService fetchService;
	
	@GET
	@Path("/{identifier}")
	public Stock fetchShare(String identifier){
		System.out.print(identifier);
		return fetchService.fetch(identifier);
	}
	
}

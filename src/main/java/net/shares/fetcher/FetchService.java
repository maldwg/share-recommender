package net.shares.fetcher;

import jakarta.enterprise.context.ApplicationScoped;
import net.shares.share.Share;

@ApplicationScoped
public class FetchService {

	public String fetch(String identifier) {
		// call yf api
		Share share = new Share(identifier, identifier);
		return share.getName();
	}
}
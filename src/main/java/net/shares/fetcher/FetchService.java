package net.shares.fetcher;

import java.io.IOException;

import io.smallrye.common.annotation.Blocking;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import net.shares.share.Share;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

@ApplicationScoped
public class FetchService {
    public Stock fetch(String identifier) {
    	Stock stock = null;
		try {
			stock = YahooFinance.get(identifier);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return stock;
    }
}
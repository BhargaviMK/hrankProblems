package com.trading.TradeApp.trade_api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StockService {

	private List<Stock> stockList = new ArrayList<>();
	
	public List<Stock> getAllStocks() {
		return stockList;
	}

	public Stock getStockBySymbol(String symbol) {	
		return stockList.stream().filter(s->s.getSymbol().equals(symbol)).findFirst().get();
	}

}

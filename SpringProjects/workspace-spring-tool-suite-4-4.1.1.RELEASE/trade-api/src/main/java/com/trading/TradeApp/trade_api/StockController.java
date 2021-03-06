package com.trading.TradeApp.trade_api;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseStatus;
	import org.springframework.web.bind.annotation.RestController;

	@RestController
	@RequestMapping(value = "/trading/stocks")
	public class StockController {
	    @Autowired
	    private StockService stockService;
	    
	    @RequestMapping(value = "/{symbol}", method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public Stock getStockBySymbol(@PathVariable String symbol) {
	        return stockService.getStockBySymbol(symbol);
	    }
	    
	    @RequestMapping(method = RequestMethod.GET)
	    @ResponseStatus(HttpStatus.OK)
	    public List<Stock> getAllStocks() {
	        return stockService.getAllStocks();
	    }
	}



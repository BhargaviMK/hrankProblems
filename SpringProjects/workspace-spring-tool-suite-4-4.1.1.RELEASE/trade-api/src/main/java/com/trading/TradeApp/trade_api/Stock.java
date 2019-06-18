package com.trading.TradeApp.trade_api;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    private String symbol;
    
    private String name;

    public Stock() {
    }
    
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    public String getSymbol() {
        return this.symbol;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}

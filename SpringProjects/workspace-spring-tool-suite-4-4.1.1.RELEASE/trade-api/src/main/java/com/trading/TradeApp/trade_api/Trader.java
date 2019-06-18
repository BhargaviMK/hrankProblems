package com.trading.TradeApp.trade_api;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Trader implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    
	    private String name;
	    private String email;
	    
	    private Float balance;
	    
	    private Timestamp creationTime;
	    private Timestamp modificationTime;

	    public Trader() {
	    }
	    
	    public Trader(String name, String email, Float balance) {
	        this.name = name;
	        this.email = email;
	        this.balance = balance;
	    }
	    
	    public Long getId() {
	        return this.id;
	    }
	    
	    public String getName() {
	        return this.name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getEmail() {
	        return this.email;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public Float getBalance() {
	        return this.balance;
	    }
	    
	    public void setBalance(Float balance) {
	        this.balance = balance;
	    }
	    
	    public Timestamp getCreationTime() {
	        return this.creationTime;
	    }
	    
	    public Timestamp getModificationTime() {
	        return this.modificationTime;
	    }
	}




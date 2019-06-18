package com.trading.TradeApp.trade_api;

import java.sql.Timestamp;

public class UpdatedTraderDTO {
	private String id;
	private String name;
	private String email;
	private Float balance; 
    private Timestamp creationTime;
    private Timestamp modificationTime;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	 public Timestamp getModificationTime() {
		return modificationTime;
	}

	public void setModificationTime(Timestamp modificationTime) {
		this.modificationTime = modificationTime;
	}
	public Float getBalance() {
		return balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}
	public Timestamp getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Timestamp creationTime) {
		this.creationTime = creationTime;
	}
	
}

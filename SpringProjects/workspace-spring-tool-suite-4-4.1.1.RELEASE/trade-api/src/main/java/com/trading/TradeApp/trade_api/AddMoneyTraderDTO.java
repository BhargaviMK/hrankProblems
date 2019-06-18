package com.trading.TradeApp.trade_api;

public class AddMoneyTraderDTO {
	
	
	 private Float balance;
	 private String email;
		
	 	public AddMoneyTraderDTO(Float balance, String email) {
	 		this.balance=balance;
	 		this.email=email;
	 	}
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		public Float getBalance() {
			return balance;
		}
	
		public void setBalance(Float balance) {
			this.balance = balance;
		}
}

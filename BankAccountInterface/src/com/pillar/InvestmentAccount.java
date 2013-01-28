package com.pillar;

public class InvestmentAccount implements Account {

	private double balance = 0.00;
	
	public double balance() {
		return this.balance;
	}
	
	public void buy(int quantity, String symbol) {
		//this is made up
		this.balance = this.balance + (quantity / 5);
	}
	
	public void sell(int quantity, String symbol) {
		//this is made up
		this.balance = this.balance + (quantity * 5);
	}

}

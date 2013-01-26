package com.pillar.EasternTeam.vendingMachine;

public class VendingMachine {
	private String display = "INSERT COIN";
	public String getDisplay() {
		return display;
	}
	
	public void insertCoin(String value) {
		if (value.equals("nickle")){
			display = "5 Cents";
		}	else if (value.equals("dime")){
			display = "10 Cents";
		}
	}
}

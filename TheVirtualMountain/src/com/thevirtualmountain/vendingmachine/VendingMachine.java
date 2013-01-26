package com.thevirtualmountain.vendingmachine;

public class VendingMachine {

	public String getDisplay() {
		return "INSERT COIN";
	}

	public String insertCoin(String coin) {
		
		if (coin.equals("Nickel")){
			return "0.05";
		}
		else if (coin.equals("Dime")){
			return "0.10";
		}
		else if (coin.equals("Quarter")) {
			return "0.25";
		}
		else{
			return "INSERT COIN";
		}
	}

}

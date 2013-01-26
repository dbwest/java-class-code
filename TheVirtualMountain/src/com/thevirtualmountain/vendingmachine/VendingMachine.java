package com.thevirtualmountain.vendingmachine;

public class VendingMachine {

	private static double currentTotal;
	private static final double Nickel = 0.05;
	private static final double Dime = 0.10;
	private static final double Quarter = 0.25;
	
	private static final double ColaPrice = 1.00;
	
	public VendingMachine() {
		currentTotal = 0.0;
	}
	
	public String getDisplay() {
		
		if (currentTotal > 0.0) {
			return String.format("%.2f", currentTotal);
		}
		
		return "INSERT COIN";
	}


	public String insertCoin(String coin) {
		
		if (coin.equals("Nickel")){
			currentTotal += Nickel;
			return "0.05";
		}
		else if (coin.equals("Dime")){
			currentTotal += Dime;
			return "0.10";
		}
		else if (coin.equals("Quarter")) {
			currentTotal += Quarter;
			return "0.25";
		}
		else{
			return "INSERT COIN";
		}
	}

	public String dispenseProduct(String product) {
		if(product.equals("Cola") && currentTotal >= ColaPrice){
			return "Cola";
		}
		return null;
	}

}

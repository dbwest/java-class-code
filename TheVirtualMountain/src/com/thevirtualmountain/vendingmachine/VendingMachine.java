package com.thevirtualmountain.vendingmachine;

public class VendingMachine {

	private static double currentTotal;
	private static final double Nickel = 0.05;
	private static final double Dime = 0.10;
	private static final double Quarter = 0.25;
	
	private static final double ColaPrice = 1.00;
	private static final double ChipsPrice = 0.50;
	private static final double CandyPrice = 0.65;
	
	private static boolean hasDispensed = false;
	
	private static String currentDisplay;
	
	public VendingMachine() {
		currentTotal = 0.0;
		currentDisplay = "INSERT COIN";
	}
	
	public String getDisplay() {
		
		if (currentTotal > 0.0 && !hasDispensed) {
			return String.format("%.2f", currentTotal);
		}
		
		return currentDisplay;
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
		String dispenseItem = "";
		
		if(product.equals("Cola") && currentTotal >= ColaPrice){
			dispenseItem = "Cola";
		}
		else if (product.equals("Chips") && currentTotal >= ChipsPrice) {
			dispenseItem = "Chips";
		}
		else if (product.equals("Candy") && currentTotal >= CandyPrice) {
			dispenseItem = "Candy";
		}
		
		currentDisplay = "THANK YOU";
		hasDispensed = true;
		return dispenseItem;
	}

}

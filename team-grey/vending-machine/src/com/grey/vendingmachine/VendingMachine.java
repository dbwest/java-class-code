package com.grey.vendingmachine;
import java.util.*;

public class VendingMachine {
	private String displayValue = "INSERT COIN";
	private double cashAmt = 0;
	private ArrayList<String> returnSlot = new ArrayList<String>();
	private Map<String, Double> coinTypes = new HashMap<String, Double>();
	
	public VendingMachine(){
		coinTypes.put("Quarter", 0.25);
		coinTypes.put("Dime", 0.10);
		coinTypes.put("Nickel", 0.05);
	}
	
	public String displayValue() {		
		return displayValue;
	}

	public void insertCoin(String coin) {
		if (coinTypes.containsKey(coin)){
			cashAmt += coinTypes.get(coin);
			displayValue = String.format("%4.2f", cashAmt);
		}
		else {
			returnSlot.add(coin);
		}	
	}

	public Object[] returnSlot() {
	
		return returnSlot.toArray();
	}
}

package com.grey.vendingmachine;
import java.util.*;

public class VendingMachine {
	private String displayValue = "INSERT COIN";
	private double cashAmt = 0;
	private ArrayList<String> returnSlot = new ArrayList<String>();
	
	public String displayValue() {		
		return displayValue;
	}

	public void insertCoin(String coin) {
		if (coin == "Quarter") {
			cashAmt = cashAmt + .25;
			displayValue = String.format("%4.2f", cashAmt);
		}
		else if (coin == "Nickel") {
			cashAmt = cashAmt + .05;
			displayValue = String.format("%4.2f", cashAmt);
		}
		else {
			returnSlot.add(coin);
			displayValue = "INSERT COIN";
		}	
	}

	public Object[] returnSlot() {
	
		return returnSlot.toArray();
	}
}

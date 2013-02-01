package com.arracos.vendingmachine;

import java.util.ArrayList;

public class VendingMachine {
	public String coin;
	
	private ArrayList<Coin> insertedCoins = new ArrayList<Coin>();
	private float curSaleAmt = 0.0f;
	private String dispTxt;
	 
	public String updateDisplay() {
		
		if (curSaleAmt > 0f) {
			dispTxt = Float.toString(curSaleAmt);
		} else {
			dispTxt = "INSERT COIN";	
		}
		
		return dispTxt;
	}

	public void acceptCoin(String coin) {
		Coin curCoin = new Coin(coin);
		
		if (curCoin.isValid()) {
			curSaleAmt += curCoin.getValue();
			insertedCoins.add(curCoin);
			updateDisplay();
		} else {
			updateDisplay();
		}
	}
	
	public float getCurSaleAmt() {
		return curSaleAmt;
	}
	
	public String getDispTxt() {
		return dispTxt;
	}
}

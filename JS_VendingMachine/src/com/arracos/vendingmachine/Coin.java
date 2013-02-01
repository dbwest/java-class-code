package com.arracos.vendingmachine;

public class Coin {
	
	private boolean isValid;
	private float value;
	
	public enum ValidCoins {
		QUARTER (0.25f),
		DIME (0.1f),
		NICKEL (0.05f);
		
		private final float value;
		ValidCoins(float value) {
			this.value = value;
		}
		
		float value() { return value; }
	}

	public Coin(String cType){
		float value = 0.0f;
		
		if (cType.toLowerCase() == "quarter"){
			value = ValidCoins.QUARTER.value();
		} else if (cType.toLowerCase() == "dime") {
			value = ValidCoins.DIME.value();
		} else if (cType.toLowerCase() == "nickel") {
			value = ValidCoins.NICKEL.value();
		}
		
		if (value > 0) {
			this.value = value;
			this.isValid = true;	
		} else {
			this.isValid = false;
		}
	}
	
	public Coin() {
		value = 0.0f;
		isValid = false;
	}
	
	public float getValue() {
		return value;
	}
	
	public boolean isValid(){
		return isValid;
	}
	
	public float setCoin(String cType) {
		float value = 0.0f;
		
		if (cType.toLowerCase() == "quarter"){
			value = ValidCoins.QUARTER.value();
		} else if (cType.toLowerCase() == "dime") {
			value = ValidCoins.DIME.value();
		} else if (cType.toLowerCase() == "nickel") {
			value = ValidCoins.NICKEL.value();
		}
		
		if (value > 0) {
			this.value = value;
			this.isValid = true;	
		} else {
			this.isValid = false;
		}
		return this.value;
	}
}

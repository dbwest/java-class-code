package com.pillartechnology.snacksrus;

public class VendingMachine {

	public String coin;
 
	public String getDisplay() {

		return "INSERT COIN";
	}

	public String acceptCoin(String coin) {
		if (coin == "quarter") {
			this.coin = "quarter";
		} else if (coin == "dime") {
			this.coin = "dime";
		} else if (coin == "nickel") {
			this.coin = "nickel";
		} else {
			return "coin returned: " + coin;
		}

		return this.coin;
	}


}

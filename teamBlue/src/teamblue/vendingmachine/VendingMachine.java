package teamblue.vendingmachine;

public class VendingMachine {
	private int accumulatedValue = 0;
	
	VendingMachine() {
		
	}
	
	public String getDisplay(){
		return "INSERT COIN";
	}

	public int getValue(String string) {
		int value = 0;
		
		if (string.equalsIgnoreCase("QUARTER")) {
			value = 25;
		}
		
		if (string.equalsIgnoreCase("DIME")) {
			value = 10;
		}
		
		if (string.equalsIgnoreCase("NICKLE")){ 
			value = 5;
		}
		
		return value;
	}

	public boolean isValid(String string) {

		return (getValue(string) > 0);
	}

	public boolean insertCoin(String coinString) {
		if (isValid(coinString)) {
			accumulatedValue += getValue(coinString);
			return true;
		}
		else {
			return false;
		}
	}

	public int getAccumulatedValue() {
		return accumulatedValue;
	}

	

} 

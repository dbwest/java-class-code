package teamblue.vendingmachine;

public class VendingMachine {
	
	VendingMachine(){
		
	}
	
	public String getDisplay(){
		return "INSERT COIN";
	}

	public int getValue(String string) {
		int value = 0;
		
		if (string == "QUARTER")
			value = 25;
		
		if (string == "DIME")
			value = 10;
		
		return value;
	}

	

} 

package com.teamred.vmred;

public class VM {
	
	private String displayBoard = "INSERT COIN"  ;
	
	public int accept(Coins type) {		
		return type.value();
	}

	public Object getDisplay() {
		return displayBoard;
	}

	public void insert(Coins type) {
		int moneyInserted = this.accept(type);
		if (moneyInserted != 0) {
			displayBoard = String.valueOf(moneyInserted) ;				

		}
	}

}

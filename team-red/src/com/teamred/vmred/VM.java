package com.teamred.vmred;

public class VM {
	static final String INSERTCOIN = "INSERT COIN" ;
	private String displayBoard = INSERTCOIN  ;
	private int account = 0 ;
	private int bin = 0;

	public int accept(Coins type) {		
		return type.value();
	}

	public Object getDisplay() {
		return displayBoard;
	}

	public void insert(Coins type) {
		int moneyInserted = this.accept(type);
		account += moneyInserted ; 

		if (moneyInserted != 0) {
			displayBoard = String.valueOf(account) ;
		}
		else { 
			displayBoard = INSERTCOIN ;
		}


	}

	public int getChangeBin() {
		
		return bin;
	}

	public void eject() {

		int holder = account;
		account = 0;
		bin += holder;

		return;
	}

}

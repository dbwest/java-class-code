package com.teamred.vmred;

public enum Coins {
	nickeles (5) ,	
	dime (10), 
	quarter (25), 
	invalidCoin(0) ;
	
	Coins(int cents) {
	 this.value = cents ;	
	}
	
	private final int value ;

	public int value() { return value; }
	
	

}

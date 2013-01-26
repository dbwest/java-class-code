package com.thevirtualmountain.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine machine;
	
	@Before
	public void setup() {
		machine = new VendingMachine();
	}
	
	/**
	 * Accept Coins
	 */
	
	@Test
	public void itDisplaysInsertCoinWhenNoCoinsInserted() {
		assertEquals("INSERT COIN", machine.getDisplay());
	}
	
	@Test
	public void itDisplaysFiveCentsWhenPassedNickel(){
		assertEquals("0.05", machine.insertCoin("Nickel"));
	}
	
	@Test
	public void itDisplaysTenCentsWhenPassedDime() {
		assertEquals("0.10", machine.insertCoin("Dime"));
	}
	
	@Test
	public void itDisplaysTenCentsWhenPassedQuarter() {
		assertEquals("0.25", machine.insertCoin("Quarter"));
	}
	
	@Test
	public void itDisplaysInsertCoinWhenInvalidCoinInserted() {
		assertEquals("INSERT COIN", machine.insertCoin("Penny"));
	}
	
	@Test
	public void itDisplaysTotalValueWhenMultipleCoinsInserted(){
		machine.insertCoin("Nickel");
		machine.insertCoin("Quarter");
		
		assertEquals("0.30", machine.getDisplay());
	}
	
	/**
	 * Select Product
	 */
	
	@Test
	public void itDispensesColaWhenOneDollarHasBeenInserted() {
		machine.insertCoin("Quarter");
		machine.insertCoin("Quarter");
		machine.insertCoin("Quarter");
		machine.insertCoin("Quarter");
		
		assertEquals("Cola", machine.dispenseProduct("Cola"));
	}

}

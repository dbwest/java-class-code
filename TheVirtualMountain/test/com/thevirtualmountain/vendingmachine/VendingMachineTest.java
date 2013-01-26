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

}

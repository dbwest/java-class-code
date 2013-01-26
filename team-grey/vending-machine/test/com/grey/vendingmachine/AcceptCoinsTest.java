package com.grey.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AcceptCoinsTest {
	
	private VendingMachine machine;
	
	@Before
    public void setUp() {
		machine = new VendingMachine();
    }

	@Test
	public void itDisplaysInsertCoinWhenCoinless() {
		assertEquals("INSERT COIN", machine.displayValue());
	}
	
	@Test
	public void itDisplaysProperValueWhenCoinInserted() {
		machine.insertCoin("Quarter");
		
		assertEquals("0.25", machine.displayValue());
	}
	
	@Test
	public void itDisplaysValueofCoinsInserted() {
		machine.insertCoin("Nickel");
		machine.insertCoin("Quarter");
		
		assertEquals("0.30", machine.displayValue());
	}
	
	@Test
	public void itDoesNotDisplayValueforPennies() {
		machine.insertCoin("Penny");
		
		assertEquals("INSERT COIN", machine.displayValue());
		assertArrayEquals(new String[] {"Penny"}, machine.returnSlot());
	}

}

package com.grey.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class AcceptCoinsTest {

	@Test
	public void itDisplaysInsertCoinWhenCoinless() {
		VendingMachine machine = new VendingMachine();
		
		assertEquals("INSERT COIN", machine.getDisplayValue());
	}

}

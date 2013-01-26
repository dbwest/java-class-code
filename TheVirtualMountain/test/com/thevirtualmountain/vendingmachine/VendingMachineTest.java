package com.thevirtualmountain.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDisplaysInsertCoinWhenNoCoinsInserted() {
		VendingMachine machine = new VendingMachine();
		
		assertEquals("INSERT COIN", machine.getDisplay());
	}

}

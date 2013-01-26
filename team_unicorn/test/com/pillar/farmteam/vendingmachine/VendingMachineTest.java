package com.pillar.farmteam.vendingmachine;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDisplaysInsertCoinWhenNoCoinless() {
		VendingMachine machine = new VendingMachine();
		assertEquals("INSERT COIN", machine.getDisplay());
	}
}

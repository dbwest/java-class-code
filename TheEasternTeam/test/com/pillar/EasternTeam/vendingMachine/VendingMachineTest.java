package com.pillar.EasternTeam.vendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDesplaysInsertCoinWhenNoCoinless() {
		VendingMachine machine = new VendingMachine();
		assertEquals("INSERT COIN",machine.getDisplay());
	}

}

package com.pillar.EasternTeam.vendingMachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDesplaysInsertCoinWhenNoCoinless() {
		VendingMachine machine = new VendingMachine();
		assertEquals("INSERT COIN",machine.getDisplay());
	}
	
	@Test
	public void itDesplays5CentsWhenNickleIsInserted() {
		VendingMachine machine = new VendingMachine();
		machine.insertCoin("nickle");
		assertEquals("5 Cents", machine.getDisplay());
	}
	
	@Test
	public void itDesplays10CentsWhenDimeIsInserted() {
		VendingMachine machine = new VendingMachine();
		machine.insertCoin("dime");
		assertEquals("10 Cents", machine.getDisplay());
	}
}

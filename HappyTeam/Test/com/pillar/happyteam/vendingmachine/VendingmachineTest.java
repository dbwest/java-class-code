package com.pillar.happyteam.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Test;

public class VendingmachineTest {

	@Test
	public void Displaycoinlesswhennocoins() {
		
		Vendingmachine machine = new Vendingmachine();
		assertEquals("Insert Coin",machine.getDisplay());
		
		
		
		
		
	}

}

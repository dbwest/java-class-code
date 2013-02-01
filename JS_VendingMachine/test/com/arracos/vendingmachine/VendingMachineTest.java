package com.arracos.vendingmachine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	private VendingMachine machine;

	@Before
	public void setup(){
		machine = new VendingMachine();
	}
	
	@Test
	public void itAccpetsQuarter(){
		machine.acceptCoin("quarter");
		assertEquals(0.25f, machine.getCurSaleAmt(), 0);
	}
	
	@Test
	public void itDisplays25(){
		machine.acceptCoin("quarter");
		assertEquals("0.25", machine.updateDisplay());
	}

}

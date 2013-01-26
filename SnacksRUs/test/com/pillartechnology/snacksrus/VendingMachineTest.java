package com.pillartechnology.snacksrus;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine machine;

	@Before
	public void setup(){
		machine = new VendingMachine();
	}
	
	@Test
	public void itDisplaysInsertCoinWhenCoinless(){
		assertEquals("INSERT COIN", machine.getDisplay());
	}

	
	@Test
	public void itAcceptsQuarter(){
		assertEquals("quarter", machine.acceptCoin("quarter"));
	}
	
	@Test
	public void itAcceptsDime(){
		assertEquals("dime", machine.acceptCoin("dime"));
	}
	
	@Test
	public void itAcceptsNickels(){
		assertEquals("nickel", machine.acceptCoin("nickel"));
	}
	
	@Test
	public void itIsNotAValidCoin(){
		assertEquals("coin returned: penny", machine.acceptCoin("penny"));
	}
	
}

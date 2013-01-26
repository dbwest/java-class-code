package com.pillartechnology.snacksrus;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDisplaysInsertCoinWhenCoinless(){
		VendingMachine machine = new VendingMachine();
		
		assertEquals("INSERT COIN", machine.getDisplay());
	}
}

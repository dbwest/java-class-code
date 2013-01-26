package com.teamred.vmred;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VMTest {
	VM vm;
	
	@Before
	public void setUp() throws Exception {
		vm = new VM() ;
	}
	
	@Test 
	public void itAcceptsNickels() {
		assertEquals (5, vm.accept(Coins.nickeles,5) ); 
		
	}
	
	@Test
	public void itAcceptsAllDimes() {
		assertEquals (10, vm.accept(Coins.dime, 10));
	}

}

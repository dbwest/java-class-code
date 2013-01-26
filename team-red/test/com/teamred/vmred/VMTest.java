package com.teamred.vmred;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VMTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test 
	public void itAcceptsNickels() {
		VM vm = new VM() ;
		assertEquals (5, vm.accept(Coins.nickeles,5) ); 
		
	}

}

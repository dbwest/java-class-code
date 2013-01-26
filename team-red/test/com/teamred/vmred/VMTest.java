package com.teamred.vmred;


import org.junit.Before;

public class VMTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test 
	public void itAcceotsNickels() {
		VM vm = new VM() ;
		assertEquals (5, vm.accept(Coins.nickeles,5) ); 
		
	}

}

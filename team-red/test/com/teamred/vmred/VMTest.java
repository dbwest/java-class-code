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
	public void itDisplaysInsertCoin() {
		assertEquals (vm.getDisplay(),"INSERT COIN");
	}
	
	@Test 
	public void itAcceptsNickels() {
		assertEquals (5, vm.accept(Coins.nickeles) ); 
		
	}
	
	@Test
	public void itAcceptsAllDimes() {
		assertEquals (10, vm.accept(Coins.dime));
	}

	@Test
	public void itAcceptsAllQuarters() {
		assertEquals (25, vm.accept(Coins.quarter));
	}	
	
	@Test
	public void itShouldNotAcceptsPennies() {
		assertEquals (0, vm.accept(Coins.invalidCoin));
	}
	


}
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
	
	@Test
	public void itDisplaysTheValueOfACoin() {
		vm.insert(Coins.quarter);
		assertEquals ("25", vm.getDisplay());
	}

	@Test
	public void itDisplaysInsertCoinWhenNoMoney() {
		vm.insert(Coins.invalidCoin);
		assertEquals ("INSERT COIN", vm.getDisplay());
	}	
	@Test
	public void itDisplays35IfYouPutInAQuarterAndADime() {
		vm.insert(Coins.quarter);
		vm.insert(Coins.dime);

		assertEquals ("35", vm.getDisplay());
	}
	
	@Test
	public void itDisplays50IfYouPutInAQuarterAndADime() {
		vm.insert(Coins.quarter);
		vm.insert(Coins.dime);
		vm.insert(Coins.nickeles);
		vm.insert(Coins.nickeles);
		vm.insert(Coins.nickeles);

		assertEquals ("50", vm.getDisplay());
	}

	@Test
	public void itReturnsZeroOnInvalidCoin() {
		vm.insert(Coins.invalidCoin);
		assertEquals ("0", vm.getChangeBin());
	}

	@Test
	public void itReturnsAccountValue() {
		vm.insert(Coins.quarter);
		vm.eject() ; 
		assertEquals ("25", vm.getChangeBin());
	}
	
	
}

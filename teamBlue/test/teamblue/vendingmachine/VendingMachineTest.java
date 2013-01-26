package teamblue.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDisplaysInsertCoinsWhenCoinless() {
		VendingMachine machine = new VendingMachine();
		assertEquals("INSERT COIN", machine.getDisplay());
		
	}
	
	@Test
	public void itAssignsAValueForAQuarter() {
		VendingMachine machine = new VendingMachine();
		assertEquals(25, machine.getValue("QUARTER"));
	}

	@Test
	public void itAssignsAValueForADime() {
		VendingMachine machine = new VendingMachine();
		assertEquals(10, machine.getValue("DIME"));
	}
	

	@Test
	public void itAssignsAValueForANickle() {
		VendingMachine machine = new VendingMachine();
		assertEquals(5, machine.getValue("NICKLE"));
	}
	

	@Test
	public void itIsValidCoin() {
		VendingMachine machine = new VendingMachine();
		assertEquals(false, machine.isValid("PENNY"));
		assertEquals(true, machine.isValid("NICKLE"));
		assertEquals(true, machine.isValid("DIME"));
		assertEquals(true, machine.isValid("QUARTER"));
	}
	
	
}
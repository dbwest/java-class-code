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
}
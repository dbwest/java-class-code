package teamblue.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {

	@Test
	public void itDisplaysInsertCoinsWhenCoinless() {
		VendingMachine machine = new VendingMachine();
		assertEquals("INSERT COIN", machine.getDisplay());
		
	}

}
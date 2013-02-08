package com.awesomevending.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setup() {
        machine = new VendingMachine();
        machine.setCoinTranslator(new MockCoinTranslator());
    }

    @Test
    public void itUpdatesDisplayWithValueOfInsertedCoin() {
        machine.insertCoin("COIN");
        assertEquals("0.45", machine.getDisplay());
    }

    @Test
    public void itUpdatesDisplayWithValueOfMultipleInsertedCoins() {
        machine.insertCoin("COIN");
        machine.insertCoin("COIN");
        assertEquals("0.90", machine.getDisplay());
    }

    @Test
    public void itDisplaysInvalidWhenBadCoinIsInserted() {
        machine.insertCoin("BAD_COIN");
        assertEquals("INVALID", machine.getDisplay());
    }

}

package com.awesomevending.vendingmachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void itPutsInvalidCoinsInTheCoinReturn() {
        machine.insertCoin("LOONIE");
        assertTrue(machine.getCoinReturn().contains("LOONIE"));
    }

    @Test
    public void itPutsMutipleInvalidCoinsInTheCoinReturn() {
        machine.insertCoin("LOONIE");
        machine.insertCoin("BAD_COIN");
        assertTrue(machine.getCoinReturn().contains("LOONIE"));
        assertTrue(machine.getCoinReturn().contains("BAD_COIN"));
        assertEquals(2, machine.getCoinReturn().size());
    }

}

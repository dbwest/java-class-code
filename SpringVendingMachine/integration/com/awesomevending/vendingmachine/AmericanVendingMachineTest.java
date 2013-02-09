package com.awesomevending.vendingmachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AmericanVendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("american_context.xml");
        machine = (VendingMachine) context.getBean("american");
    }

    @Test
    public void itTakesQuarters() {
        machine.insertCoin("QUARTER");
        assertEquals("0.25", machine.getDisplay());
    }

    @Test
    public void itTakesNickels() {
        machine.insertCoin("NICKEL");
        assertEquals("0.05", machine.getDisplay());
    }

    @Test
    public void itTakesDimes() {
        machine.insertCoin("DIME");
        assertEquals("0.10", machine.getDisplay());
    }

    @Test
    public void itDoesNotTakeLoonies() {
        machine.insertCoin("LOONIE");
        assertEquals("INVALID", machine.getDisplay());
    }

    @Test
    public void itAddsCoins() {
        machine.insertCoin("NICKEL");
        machine.insertCoin("DIME");
        machine.insertCoin("QUARTER");
        assertEquals("0.40", machine.getDisplay());
    }

    @Test
    public void itPutsInvalidCoinsInTheCoinReturn() {
        machine.insertCoin("LOONIE");
        assertTrue(machine.getCoinReturn().contains("LOONIE"));
    }

}

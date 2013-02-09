package com.awesomevending.vendingmachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CanadianVendingMachineTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("canadian_context.xml");
        machine = (VendingMachine) context.getBean("canadian");
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
    public void itTakesLoonies() {
        machine.insertCoin("LOONIE");
        assertEquals("1.00", machine.getDisplay());
    }

    @Test
    public void itTakesToonies() {
        machine.insertCoin("TOONIE");
        assertEquals("2.00", machine.getDisplay());
    }

    @Test
    public void itDoesNotTakeEuros() {
        machine.insertCoin("EURO");
        assertEquals("0.00", machine.getDisplay());
    }

    @Test
    public void itAddsCoins() {
        machine.insertCoin("NICKEL");
        machine.insertCoin("DIME");
        machine.insertCoin("QUARTER");
        machine.insertCoin("LOONIE");
        machine.insertCoin("TOONIE");
        assertEquals("3.40", machine.getDisplay());
    }

    @Test
    public void itPutsInvalidCoinsInTheCoinReturn() {
        machine.insertCoin("EURO");
        assertTrue(machine.getCoinReturn().contains("EURO"));
    }

}

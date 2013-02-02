package com.pillar.farmteam.vendingmachine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AcceptCoinsTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void it_displays_insert_coin_when_no_coins_have_been_inserted() {
        assertEquals("INSERT COIN", machine.display());
    }

    @Test
    public void it_has_an_empty_coin_tray_when_no_coins_have_been_inserted() {
        assertTrue(machine.coinTray().isEmpty());
    }

    @Test
    public void it_displays_5cents_when_nickel_has_been_inserted() {
        machine.insertCoin("NICKEL");
        assertEquals("0.05", machine.display());
    }

    @Test
    public void it_displays_10cents_when_dime_has_been_inserted() {
        machine.insertCoin("DIME");
        assertEquals("0.10", machine.display());
    }

    @Test
    public void it_displays_25cents_when_quarter_has_been_inserted() {
        machine.insertCoin("QUARTER");
        assertEquals("0.25", machine.display());
    }

    @Test
    public void it_displays_insert_coin_when_only_an_invalid_coin_has_been_inserted() {
        machine.insertCoin("PENNY");
        assertEquals("INSERT COIN", machine.display());
    }

    @Test
    public void it_places_invalid_coin_into_the_coin_tray() {
        machine.insertCoin("PENNY");
        assertTrue(machine.coinTray().contains("PENNY"));
    }

    @Test
    public void it_has_an_empty_coin_tray_when_all_coins_valid() {
        machine.insertCoin("DIME");
        assertTrue(machine.coinTray().isEmpty());
    }

    @Test
    public void it_has_two_coins_in_coin_tray_when_two_invalid_coins_are_inserted() {
        machine.insertCoin("PENNY");
        machine.insertCoin("WASHER");
        assertTrue(machine.coinTray().contains("PENNY"));
        assertTrue(machine.coinTray().contains("WASHER"));
        assertEquals(2, machine.coinTray().size());
    }

    @Test
    public void it_updates_display_with_total_when_multiple_coins_inserted() {
        machine.insertCoin("DIME");
        machine.insertCoin("NICKEL");
        machine.insertCoin("QUARTER");
        assertEquals("0.40", machine.display());
    }
}

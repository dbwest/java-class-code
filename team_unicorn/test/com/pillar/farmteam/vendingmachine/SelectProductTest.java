package com.pillar.farmteam.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SelectProductTest {

    private VendingMachine machine;

    @Before
    public void setUp() {
        machine = new VendingMachine();
    }

    @Test
    public void it_displays_price_of_cola_when_cola_is_pressed_and_no_money_is_in_machine() {
        machine.select(Product.COLA);
        assertEquals("PRICE 1.00", machine.display());
    }

    @Test
    public void it_displays_price_of_chips_when_chips_is_pressed_and_no_money_is_in_machine() {
        machine.select(Product.CHIPS);
        assertEquals("PRICE 0.50", machine.display());
    }

    @Test
    public void it_displays_price_of_candy_when_candy_is_pressed_and_no_money_is_in_machine() {
        machine.select(Product.CANDY);
        assertEquals("PRICE 0.65", machine.display());
    }
}

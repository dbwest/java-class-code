package com.awesomevending.vendingmachine;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CoinTranslatorTest {

    private CoinTranslatorImpl translator;

    @Before
    public void setup() {

        Map<String, Double> coinValues = new HashMap<String, Double>();
        coinValues.put("COIN", 0.45);

        translator = new CoinTranslatorImpl();
        translator.setCoinValues(coinValues);
    }

    @Test
    public void itReturnsTheValueOfCoin() throws InvalidCoinException {
        double value = translator.valuateCoin("COIN");
        assertEquals(0.45, value, 0.001);
    }

    @Test(expected = InvalidCoinException.class)
    public void itThrowsInvalidCoinExceptionWhenCoinIsInvalid() throws InvalidCoinException {
        translator.valuateCoin("BAD_COIN");
    }

}

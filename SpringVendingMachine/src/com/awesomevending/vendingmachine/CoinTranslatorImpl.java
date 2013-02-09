package com.awesomevending.vendingmachine;

import java.util.Map;

public class CoinTranslatorImpl implements CoinTranslator {

    private Map<String, Double> coinValues;

    public void setCoinValues(Map<String, Double> coinValues) {
        this.coinValues = coinValues;
    }

    public double valuateCoin(String coin) {
        Double value = coinValues.get(coin);
        if (value == null)
            throw new InvalidCoinException();
        return value;
    }

}

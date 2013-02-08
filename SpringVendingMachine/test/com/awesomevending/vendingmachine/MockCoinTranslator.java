package com.awesomevending.vendingmachine;

public class MockCoinTranslator implements CoinTranslator {

    public double valuateCoin(String coin) throws InvalidCoinException {
        if (coin.equals("COIN"))
            return 0.45;
        throw new InvalidCoinException();
    }

}

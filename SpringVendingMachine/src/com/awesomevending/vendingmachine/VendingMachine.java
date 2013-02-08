package com.awesomevending.vendingmachine;

public class VendingMachine {

    private CoinTranslator coinTranslator;

    public void setCoinTranslator(CoinTranslator coinTranslator) {
        this.coinTranslator = coinTranslator;
    }

    private double currentTotal;
    private boolean badCoin;

    public void insertCoin(String coin) {
        try {
            currentTotal += coinTranslator.valuateCoin(coin);
        } catch (InvalidCoinException ex) {
            badCoin = true;
        }
    }

    public String getDisplay() {
        if (badCoin)
            return "INVALID";
        return String.format("%4.2f", currentTotal);
    }

}

package com.pillar.farmteam.vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendingMachine {

    private List<String> coinTray;
    private Map<String, Float> coins = new HashMap<String, Float>();
    private float currentTotal = 0f;
    private String display;

    public VendingMachine() {
        coins.put("NICKEL", 0.05f);
        coins.put("DIME", 0.10f);
        coins.put("QUARTER", 0.25f);

        coinTray = new ArrayList<String>();
        display = "INSERT COIN";
    }

    public String display() {
        if (currentTotal > 0) {
            return String.format("%4.2f", currentTotal);
        }
        return display;
    }

    public void insertCoin(String coin) {
        Float coinValue = coins.get(coin);

        if (coinValue != null) {
            currentTotal += coinValue;
        } else {
            coinTray.add(coin);
        }
    }

    public List<String> coinTray() {
        return coinTray;
    }

    public void select(Product button) {
        StringBuilder builder = new StringBuilder();
        display = builder.append("PRICE ").append(button.price()).toString();
    }
}

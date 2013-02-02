package com.pillar.farmteam.vendingmachine;

public enum Product {
    COLA("1.00"), CHIPS("0.50"), CANDY("0.65");

    private final String price;

    Product(String price) {
        this.price = price;
    }

    public String price() {
        return price;
    }
}

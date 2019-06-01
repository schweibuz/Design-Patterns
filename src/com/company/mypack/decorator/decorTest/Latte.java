package com.company.mypack.decorator.decorTest;

public class Latte extends Beverage {

    private String description = "Latte Coffee";
    private int cost = 250;

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

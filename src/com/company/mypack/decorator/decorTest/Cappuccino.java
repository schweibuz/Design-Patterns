package com.company.mypack.decorator.decorTest;

public class Cappuccino extends Beverage {

    private String description = "Cappuccino Coffee";
    private int cost = 230;

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

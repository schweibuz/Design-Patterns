package com.company.mypack.decorator.decorTest;

public class Mocha extends Beverage {

    private String description = "Mocha";
    private int cost = 320;

    @Override
    public int cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

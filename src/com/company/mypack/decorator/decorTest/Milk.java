package com.company.mypack.decorator.decorTest;

public class Milk extends Decorator {

    private int cost = 50;
    private String description = ", Milk";
    private Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + description;
    }
}

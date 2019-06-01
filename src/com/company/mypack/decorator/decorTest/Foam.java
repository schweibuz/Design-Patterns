package com.company.mypack.decorator.decorTest;

public class Foam extends Decorator {

    private int cost = 30;
    private String description = ", Milk Foam";
    private Beverage beverage;

    Foam(Beverage beverage) {
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

package com.company.mypack.decorator.decorTest;

public class Syrup extends Decorator {

    private int cost = 40;
    private String description = ", Chocolate Syrup";
    private Beverage beverage;

    Syrup(Beverage beverage) {
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

package com.company.mypack.decorator.decoratoroTest;

public class Milk extends CondimentDecorator {

    private double milkCost = 0.19;
    Beverage beverage;

    Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + milkCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}

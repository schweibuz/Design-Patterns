package com.company.mypack.decorator.decoratoroTest;

public class Soy extends CondimentDecorator {

    private double soyCost = 0.39;
    Beverage beverage;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + soyCost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

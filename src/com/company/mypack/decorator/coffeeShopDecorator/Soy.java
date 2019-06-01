package com.company.mypack.decorator.coffeeShopDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;
    private final double PRICE = .10;

    Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(int size) {

    }

    @Override
    public double cost() {
        return beverage.cost() + CondimentDecorator.price(PRICE, getSize());
    }
}

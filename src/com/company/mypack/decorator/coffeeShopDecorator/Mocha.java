package com.company.mypack.decorator.coffeeShopDecorator;

public class Mocha extends CondimentDecorator {

    Beverage beverage;
    private final double PRICE = .40;

    Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
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

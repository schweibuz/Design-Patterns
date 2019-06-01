package com.company.mypack.decorator.coffeeShopDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;
    private final double PRICE = .45;

    Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
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

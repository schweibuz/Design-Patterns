package com.company.mypack.decorator.coffeeShopDecorator;

public class Milk extends CondimentDecorator {

    Beverage beverage;
    private final double PRICE = .20;

    Milk(Beverage beverage) {
        this.beverage = beverage;  //wrapping to the decorator's constructor
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + CondimentDecorator.price(PRICE, getSize());
    }

    @Override
    public int getSize() {
        return beverage.getSize();
    }

    @Override
    public void setSize(int size) {

    }
}

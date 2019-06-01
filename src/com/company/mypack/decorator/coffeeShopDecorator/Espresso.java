package com.company.mypack.decorator.coffeeShopDecorator;

public class Espresso extends Beverage {

    private final double PRICE = 1.5;
    private int size = 0;

    Espresso(int size) {
        description = "Espresso" + CondimentDecorator.getSize(size);
        setSize(size);
    }

    @Override
    public double cost() {
        return CondimentDecorator.price(PRICE, size);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

}

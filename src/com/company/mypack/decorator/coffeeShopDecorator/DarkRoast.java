package com.company.mypack.decorator.coffeeShopDecorator;

public class DarkRoast extends Beverage {

    private final double PRICE = .99;
    private int size = 0;

    DarkRoast(int size) {
        description = "Dark Roast Coffee" + CondimentDecorator.getSize(size);
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

package com.company.mypack.decorator.coffeeShopDecorator;

public class HouseBlend extends Beverage {

    private final double PRICE = .89;
    private int size = 0;

    HouseBlend(int size) {
        description = "House Blend Coffee" + CondimentDecorator.getSize(size);
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

package com.company.mypack.decorator.coffeeShopDecorator;

public class Decaf extends Beverage {

    private final double PRICE = .55;
    private int size = 0;

    Decaf(int size) {
        description = "Decaff Coffee" + CondimentDecorator.getSize(size);
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

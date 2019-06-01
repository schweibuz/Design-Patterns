package com.company.mypack.decorator.coffeeShopDecorator;

public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public abstract int getSize();

    public abstract void setSize(int size);

}


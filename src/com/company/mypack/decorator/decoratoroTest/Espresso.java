package com.company.mypack.decorator.decoratoroTest;

public class Espresso extends Beverage {

    Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return .99;
    }
}

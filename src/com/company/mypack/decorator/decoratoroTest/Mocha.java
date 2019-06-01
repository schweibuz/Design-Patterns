package com.company.mypack.decorator.decoratoroTest;

public class Mocha extends Beverage {

    Mocha() {
        description = "Mocha";
    }

    @Override
    public double cost() {
        return 1.9;
    }
}

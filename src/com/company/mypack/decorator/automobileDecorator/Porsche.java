package com.company.mypack.decorator.automobileDecorator;

public class Porsche extends Automobile {

    Porsche() {
        description = "Porsche";
    }

    @Override
    public double cost() {
        return 70000;
    }
}

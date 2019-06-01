package com.company.mypack.decorator.automobileDecorator;

public class Mercedes extends Automobile {

    Mercedes() {
        description = "Mercedes";
    }

    @Override
    public double cost() {
        return 80000;
    }
}

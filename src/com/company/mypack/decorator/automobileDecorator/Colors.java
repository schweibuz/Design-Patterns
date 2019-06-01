package com.company.mypack.decorator.automobileDecorator;

public class Colors extends ComplectDecorator {

    Automobile automobile;
    double colorsPrice = 1;

    Colors(Automobile automobile) {
        this.automobile = automobile;

    }

    @Override
    public double cost() {
        return automobile.cost() + colorsPrice;
    }

    @Override
    public String getDescription() {
        return automobile.getDescription() + ", color";
    }
}

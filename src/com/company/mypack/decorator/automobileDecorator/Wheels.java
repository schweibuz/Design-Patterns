package com.company.mypack.decorator.automobileDecorator;

public class Wheels extends ComplectDecorator {

    Automobile automobile;
    double wheelPrice = 1;

    Wheels(Automobile automobile) {
        this.automobile = automobile;
    }

    @Override
    public double cost() {
        return automobile.cost() + wheelPrice;
    }

    @Override
    public String getDescription() {
        return automobile.getDescription() + ", wheels";
    }
}

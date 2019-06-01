package com.company.mypack.decorator.decoratoroTest;

public abstract class Beverage {

    public String description = "Unknown description";

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}

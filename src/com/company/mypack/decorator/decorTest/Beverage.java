package com.company.mypack.decorator.decorTest;

public abstract class Beverage {

    private String description = "Unknown beverage";

    public abstract int cost();

    public String getDescription() {
        return description;
    }

}

package com.company.mypack.decorator.coffeeShopDecorator;

public abstract class CondimentDecorator extends Beverage {

    @Override
    public abstract String getDescription();

    public static String getSize(int size) {
        if (size == 1)
            return " –> small";
        else if (size == 2)
            return " –> medium";
        else if (size == 3)
            return " –> large";
        else
            return " ...";
    }

    public static double price(double price, int size) {
        if (size == 2)
            return price;
        else if (size == 1)
            return (price - ((price * 20) / 100));
        else if (size == 3)
            return (price + ((price * 20) / 100));
        else
            return 0;
    }
}

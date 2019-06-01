package com.company.mypack.decorator.decoratoroTest;

public class Demo {
    public static void main(String[] args) {

        Beverage espresso = new Espresso();
        Beverage mocha = new Mocha();

        espresso = new Soy(espresso);

        mocha = new Milk(mocha);
        mocha = new Soy(mocha);

        System.out.println(mocha.getDescription() + " $" + mocha.cost());
        System.out.println(espresso.getDescription() + " $" + espresso.cost());
    }
}

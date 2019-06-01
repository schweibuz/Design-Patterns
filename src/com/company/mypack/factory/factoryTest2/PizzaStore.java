package com.company.mypack.factory.factoryTest2;

public abstract class PizzaStore {

    public abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {

        Pizza pizza = null;
        pizza = createPizza(type);
        System.out.println("---- Making " + pizza.getName() + " ----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}

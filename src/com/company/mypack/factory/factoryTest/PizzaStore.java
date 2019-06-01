package com.company.mypack.factory.factoryTest;

public abstract class PizzaStore {


    public abstract Pizza createPizza(String type);


    public Pizza orderPizza(String type) {
        Pizza pizza = null;

        try {
            pizza = createPizza(type);
            System.out.println("---- Making a " + pizza.getName() + " ----");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } catch (NullPointerException ex) {
            System.err.println("some pizza wasn't created");
        }
        return pizza;
    }


    static void checkForWord(String line, String str) {
        if (str == null || line == null || str == "" || line == "" || line.contains(str) == false)
            System.out.println("Unknown type of pizza");

        String line2 = line.toLowerCase();
        if (line2.contains("cheese"))
            System.out.println("Cheese Pizza");
        else if (line2.contains("veggie"))
            System.out.println("Veggie Pizza");
        else if (line2.contains("pepperoni"))
            System.out.println("Pepperoni Pizza");
    }


    static void checkPizza(Pizza pizza, String type) {
        if (pizza == null || type == "") return;
        String className = pizza.getClass().toString().toLowerCase();
        checkForWord(className, type.toLowerCase());
    }


}

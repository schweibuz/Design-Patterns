package com.company.mypack.factory.factoryTest2;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;

        if (item.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equalsIgnoreCase("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else if (item.equalsIgnoreCase("clams")) {
            pizza = new ClamsPizza(ingredientFactory);
            pizza.setName("New York Style Clams Pizza");
        } else if (item.equalsIgnoreCase("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }

        return pizza;
    }
}

package com.company.mypack.factory.factoryTest2;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggie();
    }
}

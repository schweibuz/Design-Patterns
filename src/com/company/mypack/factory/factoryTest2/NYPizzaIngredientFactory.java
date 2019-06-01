package com.company.mypack.factory.factoryTest2;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicesPepperoni();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie[] veggies = {new Onion(), new Spinach(), new BlackOlive()};
        return veggies;
    }
}

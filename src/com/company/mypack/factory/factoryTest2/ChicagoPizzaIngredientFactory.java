package com.company.mypack.factory.factoryTest2;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicesPepperoni();
    }

    @Override
    public Veggie[] createVeggie() {
        Veggie[] veggies = {new Onion(), new Garlic(),
                new BlackOlive(), new Spinach(), new MarinadedCucumber()};
        return veggies;
    }
}

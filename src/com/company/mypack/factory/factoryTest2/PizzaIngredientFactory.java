package com.company.mypack.factory.factoryTest2;

public interface PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Clams createClams();
    Pepperoni createPepperoni();
    Veggie[] createVeggie();

}

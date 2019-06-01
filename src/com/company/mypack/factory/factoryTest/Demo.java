package com.company.mypack.factory.factoryTest;

public class Demo {
    public static void main(String[] args) {

        PizzaStore newyork = new NYPizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        Pizza pizza = newyork.orderPizza("cheese");
        System.out.println(pizza);

        Pizza pizza1 = newyork.orderPizza("veggie");
        System.out.println(pizza1);

        Pizza pizza2 = newyork.orderPizza("pepperoni");
        System.out.println(pizza2);

        Pizza pizza3 = chicago.orderPizza("cheese");
        System.out.println(pizza3);

        Pizza pizza4 = chicago.orderPizza("veggie");
        System.out.println(pizza4);

        Pizza pizza5 = chicago.orderPizza("clam");
        System.out.println(pizza5);

        Pizza pizza6 = newyork.orderPizza("clam");
        System.out.println(pizza6);



    }
}

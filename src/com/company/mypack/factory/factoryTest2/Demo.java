package com.company.mypack.factory.factoryTest2;

public class Demo {
    public static void main(String[] args) {

        PizzaStore nyork = new NYPizzaStore();
        PizzaStore chicago = new ChicagoPizzaStore();

        Pizza pizza1 = nyork.orderPizza("cheese");
        System.out.println(pizza1);

        Pizza pizza2 = nyork.orderPizza("pepperoni");
        System.out.println(pizza2);

        Pizza pizza3 = nyork.orderPizza("clams");
        System.out.println(pizza3);

        Pizza pizza4 = nyork.orderPizza("veggie");
        System.out.println(pizza4);

        Pizza pizza5 = chicago.orderPizza("cheese");
        System.out.println(pizza5);

        Pizza pizza6 = chicago.orderPizza("pepperoni");
        System.out.println(pizza6);

        Pizza pizza7 = chicago.orderPizza("clams");
        System.out.println(pizza7);

        Pizza pizza8 = chicago.orderPizza("veggie");
        System.out.println(pizza8);
    }
}

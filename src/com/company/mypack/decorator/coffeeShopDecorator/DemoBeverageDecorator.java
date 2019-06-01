package com.company.mypack.decorator.coffeeShopDecorator;

public class DemoBeverageDecorator {


    public static void main(String[] args) {

        Beverage houseBlend = new HouseBlend(3);
        Beverage darkRoast = new DarkRoast(2);
        Beverage espresso = new Espresso(1);


        houseBlend = new Milk(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Milk(houseBlend);
        System.out.printf("Description: %s \ncost: $%.2f\n", houseBlend.getDescription(), houseBlend.cost());


        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Milk(darkRoast);
        System.out.printf("Description: %s \ncost: $%.2f\n", darkRoast.getDescription(), darkRoast.cost());


        espresso = new Soy(espresso);
        System.out.printf("Description: %s \ncost: $%.2f\n", espresso.getDescription(), espresso.cost());


    }
}

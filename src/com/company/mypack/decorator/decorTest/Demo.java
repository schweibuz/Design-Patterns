package com.company.mypack.decorator.decorTest;

public class Demo {
    public static void main(String[] args) {

        Beverage latte = new Latte();
        Beverage mocha = new Mocha();
        Beverage cappuccino = new Cappuccino();

        latte = new Milk(latte);

        cappuccino = new Milk(cappuccino);
        cappuccino = new Foam(cappuccino);

        mocha = new Syrup(mocha);
        mocha = new Milk(mocha);


        System.out.println(cappuccino.getDescription() + " ₽" + cappuccino.cost() + "\n–––––––––––");

        System.out.println(mocha.getDescription() + " ₽" + mocha.cost() + "\n–––––––––––");

        System.out.println(latte.getDescription() + " ₽" + latte.cost() + "\n–––––––––––");
    }
}

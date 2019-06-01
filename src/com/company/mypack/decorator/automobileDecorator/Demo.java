package com.company.mypack.decorator.automobileDecorator;

import com.company.hfdp.composite.menuiterator.CompositeIterator;

public class Demo {
    public static void main(String[] args) {

        Automobile porsche = new Porsche();
        Automobile mercedes = new Mercedes();
        Automobile mercedes2 = new Mercedes();

        porsche = new Wheels(porsche);
        porsche = new Colors(porsche);
        porsche = new Wheels(porsche);
        porsche = new Colors(porsche);
        mercedes = new Wheels(mercedes);
        mercedes = new Wheels(mercedes);
        mercedes = new Colors(mercedes);

        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Wheels(mercedes2);
        mercedes2 = new Colors(mercedes2);

        System.out.println(porsche.getDescription() + " – $" + porsche.cost());
        System.out.println(mercedes.getDescription() + " – $" + mercedes.cost());
        System.out.println(mercedes2.getDescription() + " – $" + mercedes2.cost());

    }
}

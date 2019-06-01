package com.company.mypack.factory.factoryAutomobile;

public class Demo {
    public static void main(String[] args) {

        AutoFactory mercedes = new Mercedes();
        AutoFactory porsche = new Porsche();

        mercedes.order("sport");
        System.out.println();
        mercedes.order("cross");
        System.out.println();
        mercedes.order("SEDAn");
        System.out.println();
        porsche.order("sport");
    }
}

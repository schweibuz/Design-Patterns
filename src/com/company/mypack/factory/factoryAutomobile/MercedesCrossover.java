package com.company.mypack.factory.factoryAutomobile;

public class MercedesCrossover extends Auto {

    MercedesCrossover() {
        mark = "MercedesCrossover";
        model = "Mercedes-Benz AMG GLC 63 S";
        insertion("Golden w.c. pan");
        insertion("Alessandra Ambrosio");
        insertion("Condoms");
    }

    @Override
    public void power() {
        System.out.println("503 horse power");
    }

    @Override
    public void doors() {
        System.out.println("5-door SUV");
    }

    @Override
    public void color() {
        System.out.println("Black");
    }
}

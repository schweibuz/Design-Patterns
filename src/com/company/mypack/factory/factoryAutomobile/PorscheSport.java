package com.company.mypack.factory.factoryAutomobile;

public class PorscheSport extends Auto {

    PorscheSport() {
        mark = "PorscheSport";
        model = "Porsche 911 GT3 RS";
        insertion("$50000");
        insertion("Bag");
    }

    @Override
    public void power() {
        System.out.println("520 horse power");
    }

    @Override
    public void doors() {
        System.out.println("2-door");
    }

    @Override
    public void color() {
        System.out.println("Green");
    }
}

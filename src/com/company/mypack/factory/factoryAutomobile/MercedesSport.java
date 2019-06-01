package com.company.mypack.factory.factoryAutomobile;

public class MercedesSport extends Auto {

    MercedesSport() {
        mark = "MercedesSport";
        model = "Mercedes-Benz SLS AMG";
        insertion("Jelly");
        insertion("Cola");
        insertion("Big Mac");
    }

    @Override
    public void power() {
        System.out.println("563 horse power");
    }

    @Override
    public void doors() {
        System.out.println("2-door roadster");
    }

    @Override
    public void color() {
        System.out.println("Gray");
    }
}

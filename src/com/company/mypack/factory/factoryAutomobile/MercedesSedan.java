package com.company.mypack.factory.factoryAutomobile;

public class MercedesSedan extends Auto {

    MercedesSedan() {
        mark = "MersedesSedan";
        model = "Mercedes-Maybach S 560 4MATIC";
        insertion("SU-35");
    }

    @Override
    public void power() {
        System.out.println("469 horse power");
    }

    @Override
    public void doors() {
        System.out.println("4-door sedan");
    }

    @Override
    public void color() {
        System.out.println("Red");
    }
}

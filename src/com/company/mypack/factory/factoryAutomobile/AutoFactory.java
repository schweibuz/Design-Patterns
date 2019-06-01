package com.company.mypack.factory.factoryAutomobile;

public abstract class AutoFactory {

    public abstract Auto createAuto(String item);

    public Auto order(String type) {
        Auto auto;

        auto = createAuto(type);
        System.out.println(auto.getMark());
        System.out.println(auto.getModel());
        auto.color();
        auto.doors();
        auto.power();
        auto.prepare();

        return auto;
    }
}

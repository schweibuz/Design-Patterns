package com.company.mypack.factory.factoryAutomobile;

public class Porsche extends AutoFactory {


    @Override
    public Auto createAuto(String item) {
        Auto auto = null;

        if (item.equalsIgnoreCase("sport"))
            auto = new PorscheSport();

        return auto;
    }
}

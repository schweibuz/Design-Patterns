package com.company.mypack.factory.factoryAutomobile;

public class Mercedes extends AutoFactory {

    @Override
    public Auto createAuto(String item) {

        Auto auto = null;

        if (item.equalsIgnoreCase("sport"))
            auto = new MercedesSport();
        else if (item.equalsIgnoreCase("sedan"))
            auto = new MercedesSedan();
        else if (item.equalsIgnoreCase("cross"))
            auto = new MercedesCrossover();

        return auto;
    }
}

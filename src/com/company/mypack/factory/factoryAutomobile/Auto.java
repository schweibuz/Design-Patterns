package com.company.mypack.factory.factoryAutomobile;

import java.util.ArrayList;
import java.util.List;

public abstract class Auto {

    String mark;
    String model;
    List dope = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing auto");
        System.out.println("Wash body");
        System.out.println("Pump wheels");

        for (int i = 0; i < dope.size(); i++) {
            System.out.println("Addition options: " + dope.get(i));
        }
    }

    public void insertion(String dope) {
        this.dope.add(dope);
    }

    public abstract void power();
    public abstract void doors();
    public abstract void color();

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }
}

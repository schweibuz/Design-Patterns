package com.company.mypack.factory.factoryTest2;

import java.util.Arrays;

public abstract class Pizza {

    String name;
    Dough dough;
    Veggie[] veggies;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake the pizza near 350 degrees");
    }

    public void cut() {
        System.out.println("Cutting the pizza on to diagonal slices");
    }

    public void box() {
        System.out.println("Packing the pizza into special pizza box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("---- " + name + " ----\n");
        if (dough != null) {
            stringBuffer.append(dough);
            stringBuffer.append("\n");
        }
        if (sauce != null) {
            stringBuffer.append(sauce);
            stringBuffer.append("\n");
        }
        if (cheese != null) {
            stringBuffer.append(cheese);
            stringBuffer.append("\n");
        }
        if (clams != null) {
            stringBuffer.append(clams);
            stringBuffer.append("\n");
        }
        if (pepperoni != null) {
            stringBuffer.append(pepperoni);
            stringBuffer.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                stringBuffer.append(veggies[i]);
                if (veggies.length - 1 > i)
                    stringBuffer.append(", ");
            }
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}

package com.company.mypack.strategy.stategySortTest2;

public class Maxi extends Array {

    Maxi() {
        setFind(new FindMax());
    }

    @Override
    public void display() {
        System.out.println("Max value from array");
    }
}

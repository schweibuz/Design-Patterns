package com.company.mypack.strategy.stategySortTest2;

public class Bubble extends Array {

    Bubble() {
        setSort(new BubbleSort());
    }

    @Override
    public void display() {
        System.out.println("Bubble Sort is slowest sorting in this package!");
    }
}

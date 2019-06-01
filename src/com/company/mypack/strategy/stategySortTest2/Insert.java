package com.company.mypack.strategy.stategySortTest2;

public class Insert extends Array {

    Insert() {
        setSort(new InsertionSort());
    }

    @Override
    public void display() {
        System.out.println("Insertion Sort is middle sorting in this package!");
    }
}

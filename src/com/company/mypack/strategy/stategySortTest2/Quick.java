package com.company.mypack.strategy.stategySortTest2;

public class Quick extends Array {

    Quick() {
        setSort(new QuickSort());
    }

    @Override
    public void display() {
        System.out.println("Quick Sort is fastest sort in this package!");
    }
}

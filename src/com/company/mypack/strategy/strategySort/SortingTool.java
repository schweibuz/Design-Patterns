package com.company.mypack.strategy.strategySort;

public class SortingTool {
    private Sorter sorter;
    private ReSorter reSorter;
    private int[] mas;
    long start, stop;

    SortingTool(int[] mas) {
        this.mas = mas;
    }

    public void setSorterType(Sorter sorterType) {
        this.sorter = sorterType;
        start = System.nanoTime();
        this.sorter.sort(mas);
        stop = System.nanoTime();
    }

    public void executionTime() {
        System.out.println("algorithm execution time: " + ((stop - start) / 1000000) + " ms");
    }

    public void printMas() {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public void setReSorterType(ReSorter reSorterType) {
        this.reSorter = reSorterType;
        start = System.nanoTime();
        this.reSorter.reSort(mas);
        stop = System.nanoTime();
    }

    public Sorter getSorter() {
        return sorter;
    }

    public ReSorter getReSorter() {
        return reSorter;
    }

    public int[] getMas() {
        return mas;
    }
}

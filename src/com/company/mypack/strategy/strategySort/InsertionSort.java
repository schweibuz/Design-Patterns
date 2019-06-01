package com.company.mypack.strategy.strategySort;

public class InsertionSort implements Sorter {

    @Override
    public void sort(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            int tmp = mas[i];
            int j = i;
            while (j > 0 && mas[j - 1] > tmp) {
                mas[j] = mas[j - 1];
                j--;;
            }
            mas[j] = tmp;
        }
    }
}

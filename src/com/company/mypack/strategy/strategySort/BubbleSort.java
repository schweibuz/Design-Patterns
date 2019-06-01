package com.company.mypack.strategy.strategySort;

public class BubbleSort implements Sorter {

    @Override
    public void sort(int[] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas.length - i; j++) {
                if (mas[j - 1] > mas[j]) {
                    int tmp = mas[j - 1];
                    mas[j - 1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }
}

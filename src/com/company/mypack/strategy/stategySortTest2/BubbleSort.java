package com.company.mypack.strategy.stategySortTest2;

public class BubbleSort implements Sort {
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

    @Override
    public void display(int[] mas) {
        System.out.println("Bubble Sort: ");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    @Override
    public int find(int[] mas) {
        return 0;
    }
}

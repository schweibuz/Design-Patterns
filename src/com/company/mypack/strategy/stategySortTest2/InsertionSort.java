package com.company.mypack.strategy.stategySortTest2;

public class InsertionSort implements Sort {
    @Override
    public void sort(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            int tmp = mas[i];
            int j = i;
            while (j > 0 && mas[j - 1] > tmp) {
                mas[j] = mas[j - 1];;
                j--;
            }
            mas[j] = tmp;
        }
    }

    @Override
    public void display(int[] mas) {
        System.out.println("INsertion Sort: ");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    @Override
    public int find(int[] mas) {
        return 0;
    }
}

package com.company.mypack.strategy.stategySortTest2;

public class FindMax implements Find {

    @Override
    public void sort(int[] mas) {

    }

    @Override
    public void display(int[] mas) {
        System.out.println("FIND MSAX");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    @Override
    public int find(int[] mas) {
        int i = 0;
        int tmp = mas[i];
        for (i = 1; i < mas.length; i++) {
            if (mas[i] > tmp) {
                tmp = mas[i];
            }
        }
        return tmp;
    }
}

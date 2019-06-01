package com.company.mypack.strategy.stategySortTest2;

public class QuickSort implements Sort {
    @Override
    public void sort(int[] mas) {
        quick(mas, 0, mas.length - 1);
    }

    private void quick(int[] mas, int left, int right) {
        if (left >= right) return;

        int pivot = partition(mas, left, right);

        quick(mas, left, pivot);
        quick(mas, pivot + 1, right);
    }

    private int partition(int[] mas, int left, int right) {

        int i = left;
        int j = right;
        int pivot = (left + right) / 2;
        int tmp;

        while (i < j) {
            while ((i < pivot) && (mas[i] <= mas[pivot]))
                i++;
            while ((j > pivot) && (mas[j] >= mas[pivot]))
                j--;
            if (i < j) {
                tmp = mas[i];
                mas[i] = mas[j];
                mas[j] = tmp;
                if (i == pivot) pivot = j;
                else if (j == pivot) pivot = i;
            }
        }
        return pivot;
    }

    @Override
    public void display(int[] mas) {
        System.out.println("Quick Sort: ");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
        System.out.println();
    }

    @Override
    public int find(int[] mas) {
        return 0;
    }
}

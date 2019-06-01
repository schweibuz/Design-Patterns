package com.company.mypack.hz;

public class QuickSort {
    public static void main(String[] args) {
        int[] mas = new int[5];
        QuickSort quick = new QuickSort();

        quick.print(mas);
        quick.fill(mas);
        quick.print(mas);
        quick.quick(mas);
        quick.print(mas);
    }

    public void fill(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
    }

    public void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    public void quick(int[] mas) {
        sort(mas, 0, mas.length - 1);
    }

    public void sort(int[] mas, int left, int right) {
        if (left >= right) return;
        int pivot = partition(mas, left, right);
        sort(mas, left, pivot);
        sort(mas, pivot + 1, right);
    }

    public int partition(int[] mas, int left, int right) {
        int i = left;
        int j = right;
        int pivot = (i + j) / 2;
        int tmp;
        while (i < j) {
            while (i < pivot && mas[i] <= mas[pivot])
                i++;
            while (j > pivot && mas[j] >= mas[pivot])
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
}

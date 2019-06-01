package com.company.mypack.strategy.strategySort;

public class MergeSort implements ReSorter {
    @Override
    public void reSort(int[] mas) {
        mergeSort(mas, mas.length);
    }

    private void mergeSort(int[] mas, int length) {
        if (length < 2) return;
        int mid = length / 2;
        int[] l = new int[mid];
        int[] r = new int[length - mid];
        for (int i = 0; i < mid; i++)
            l[i] = mas[i];
        for (int i = mid; i < length; i++)
            r[i - mid] = mas[i];
        mergeSort(l, mid);
        mergeSort(r, length - mid);
        merge(mas, l, r, mid, length - mid);
    }

    private void merge(int[] mas, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                mas[k++] = l[i++];
            } else {
                mas[k++] = r[j++];
            }
        }
        while (i < left) {
            mas[k++] = l[i++];
        }
        while (j < right) {
            mas[k++] = r[j++];
        }
    }
}

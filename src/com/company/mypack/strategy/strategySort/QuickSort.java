package com.company.mypack.strategy.strategySort;

public class QuickSort implements ReSorter {

    @Override
    public void reSort(int[] mas) {
        quickSort(mas, 0, mas.length - 1);
    }

    public void quickSort(int[] mas, int left, int right) {

        if (left >= right) return;

        int pivot = partition(mas, left, right);

        quickSort(mas, pivot + 1, right);
        quickSort(mas, left, pivot);
    }

    public int partition(int[] mas, int left, int right) {

        int i = left;
        int j = right;
        int pivot = (left + right) / 2;
        int tmp;

        while(i < j) {
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
        return i;
    }
}






















































/*        if (left >= right) return;

        if (left <= right) {
            int pivot = partition(mas, left, right);

//            if (left < pivot - 1)
            quickSort(mas, left, pivot);
//            if (right > pivot)
            quickSort(mas, pivot + 1, right);
        }
    }


    public int partition(int[] mas, int left, int right) {

        int i = left;
        int j = right;
        int pivot = (i + j) / 2;
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

        return i;
    }
}*/

















































/*
    int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }

    void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

}*/

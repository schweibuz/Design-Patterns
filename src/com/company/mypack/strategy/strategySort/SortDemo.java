package com.company.mypack.strategy.strategySort;

public class SortDemo {

    public static void main(String[] args) {

        final int SIZE = 30000;
        int[] mas = new int[SIZE];
        int[] mas2 = new int[SIZE];
        int[] mas3 = new int[SIZE];
        int[] mas5 = new int[SIZE];
        /*half sorted array*/
        int[] mas4 = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            if (i % 2 == 0) {
                mas[i] = i * 5;
                mas2[i] = i * 2;
                mas3[i] = i * 5;
                mas5[i] = i * 2;
            } else {
                mas[i] = i * 2;
                mas2[i] = i * 5;
                mas3[i] = i * 2;
                mas5[i] = i * 5;
            }
        }

        int x = 0;
        while (x < SIZE - 1) {
            x++;
            int mtp = SIZE/ 2;

            if (x < mtp) {
                if (x % 2 == 0) {
                    mas4[x] = x + 20;
                } else {
                    mas4[x] = x + 10;
                }
            } else {
                mas4[x] = x * 7;
            }
        }

        SortingTool firstArray = new SortingTool(mas);
        SortingTool secondArray = new SortingTool(mas2);
        SortingTool thirdArray = new SortingTool(mas3);
        SortingTool forthArray = new SortingTool(mas4);
        SortingTool fifthArray = new SortingTool(mas5);

        //invoke sorting algorithm and print array
        System.out.println("\nBubble Sort");
        firstArray.setSorterType(new BubbleSort());
        firstArray.printMas();
        firstArray.executionTime();

        System.out.println("\nInsertion Sort");
        secondArray.setSorterType(new InsertionSort());
        secondArray.printMas();
        secondArray.executionTime();

        System.out.println("\nQuick Sort");
        thirdArray.setReSorterType(new QuickSort());
        thirdArray.printMas();
        thirdArray.executionTime();

        System.out.println("\nQuick Sort for half sorted array");
        forthArray.setReSorterType(new QuickSort());
        forthArray.printMas();
        forthArray.executionTime();

        System.out.println("\nMerge Sort:");
        fifthArray.setReSorterType(new QuickSort());
        fifthArray.printMas();
        fifthArray.executionTime();

/*        QuickSort quickSortExample = new QuickSort();
        int[] mas4 = new int[] {22, 4, 2, 23, 0, 12, 7};
        quickSortExample.quickSort(mas4, 0, mas4.length - 1);
        System.out.println("\nQUICK");
        for (int i = 0; i < mas4.length; i++) {
            System.out.print(mas4[i] + " ");
        }*/
    }
}

package com.company.mypack.strategy.stategySortTest2;

public abstract class Array {
    private God god;
    private Sort sort;
    private Find find;
    private int[] mas;
    private int size = 5;


    private void fillMas() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 100);
        }
    }

    public void setSort(Sort sort) {
        this.mas = new int[size];
        fillMas();
        this.god = sort;
    }

    public void setFind(Find find) {
        this.mas = new int[size];
        fillMas();
        this.god = find;
    }

    public void display() {}

    public Sort getSort() {
        return sort;
    }

    public void sort() {
        this.god.sort(mas);
    }

    public void print() {
        this.god.display(mas);
    }

    public void find() {
        int max = this.god.find(mas);
        System.out.println(max);
    }
}

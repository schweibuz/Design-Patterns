package com.company.mypack.strategy.stategySortTest2;

public class SortDemo {
    public static void main(String[] args) {
        Bubble bubble = new Bubble();
        Insert insert = new Insert();
        Quick quick = new Quick();

        bubble.display();
        bubble.print();
        bubble.sort();
        bubble.print();

        insert.display();
        insert.print();
        insert.sort();
        insert.print();

        quick.display();
        quick.print();
        quick.sort();
        quick.print();

        Maxi max = new Maxi();
        max.print();
        max.display();
        max.find();
    }
}

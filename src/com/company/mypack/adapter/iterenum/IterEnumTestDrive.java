package com.company.mypack.adapter.iterenum;

import java.util.*;

public class IterEnumTestDrive {

    public static void main(String[] args) {

        int size = 10;
        args = new String[size];

        for (int i = 0; i < size; i++) {
            args[i] = "Just Enjoy " + i;
        }

        ArrayList list = new ArrayList(Arrays.asList(args));
        Enumeration enumeration = new IteratorEnumeration(list.iterator());

        System.out.println("Iterator");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Vector list2 = new Vector(Arrays.asList(args));
        Iterator iterator = new EnumerationIterator(list2.elements());

        System.out.println("\nEnumeration");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

package com.company.mypack.hz;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestList {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();

        TestList test = new TestList();
        list.add("SFDF");
        list.add(2323);
        list.add(TestList.class.getName());
        list.add("234234"+ 111);
        list.add(TestList.class);
//        list.pop(3);


        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext()) {
//            String value = (String) iterator.next();  //classCastException
            System.out.println(iterator.next() + " ");
        }
        System.out.println("\nsize: " + list.size());


/*        List<String> myList = new CopyOnWriteArrayList<String>();
        myList.pushItem("1");
        myList.pushItem("2");
        myList.pushItem("3");
        myList.pushItem("4");
        myList.pushItem("5");

        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")){
                myList.pop("4");
                myList.pushItem("6");
                myList.pushItem("7");
            }
        }
        System.out.println("List Size:"+myList.size());
    */
    }
}

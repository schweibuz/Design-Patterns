package com.company.mypack.hz;

public class Outer {

    private Inner inner;

    Outer(String s) {
        this.inner = new Inner(s);
    }

    private class Inner {

        Inner(String s) {
            System.out.println("This text from inner class... " + s);
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer("YO-YO");

    }
}

package com.company.mypack.singleton;

public class DoubleCheckLocking {

    private DoubleCheckLocking() {}

    private static volatile DoubleCheckLocking uniqueInstance;

    public static DoubleCheckLocking getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLocking.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLocking();
                }
            }
        }
        return uniqueInstance;
    }


    public static void main(String[] args) {
        DoubleCheckLocking doubleCheckLocking = new DoubleCheckLocking();
        System.out.println(doubleCheckLocking.getInstance().hashCode());

        DoubleCheckLocking doubleCheckLocking2 = new DoubleCheckLocking();
        System.out.println(doubleCheckLocking2.getInstance().hashCode());

        DoubleCheckLocking doubleCheckLocking3 = new DoubleCheckLocking();
        System.out.println(doubleCheckLocking3.getInstance().hashCode());
    }
}

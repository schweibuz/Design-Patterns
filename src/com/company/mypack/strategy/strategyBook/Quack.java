package com.company.mypack.strategy.strategyBook;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }
}

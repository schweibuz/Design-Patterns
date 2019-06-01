package com.company.mypack.adapter.duckapter;

import java.util.Random;

public class DuckAdapter implements Turkey, Duck {

    Duck duck = null;
    Turkey turkey = null;
    Random rnd;

    DuckAdapter(Duck duck) {
        this.duck = duck;
        rnd = new Random();
    }

    DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        if (duck != null) {
            if (rnd.nextInt(5) == 0)
                duck.fly();
        } else if (turkey != null) {
            for (int i = 0; i < 5; i++) {
                turkey.fly();
            }
        }
    }
}

package com.company.mypack.observer.observerBase;

public class MarketMini implements Observer, Display {
    private int cucumber;
    private int tomato;
    private int orange;
    private Observable costData;

    MarketMini(CostData costData) {
        this.costData = costData;
        costData.registerObserver(this);
    }

    @Override
    public void update(int cucumber, int tomato, int orange) {
        this.cucumber = cucumber;
        this.tomato = tomato;
        this.orange = orange;
        display();
    }

    @Override
    public void display() {
        System.out.printf("MarketMini - cucumber: %s, tomato: %s, orange: %s\n", cucumber, tomato, orange);
    }

    public int getCucumber() {
        return cucumber;
    }

    public int getTomato() {
        return tomato;
    }

    public int getOrange() {
        return orange;
    }

    @Override
    public String toString() {
        return "MarketMini{" +
                "cucumber=" + cucumber +
                ", tomato=" + tomato +
                ", orange=" + orange;
    }
}
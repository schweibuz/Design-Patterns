package com.company.mypack.observer.observerBase;

public class MarketSun implements Observer, Display {
    private int cucumber = 50;
    private int tomato = 80;
    private int orange = 100;
    private Observable costData;

    MarketSun(CostData costData) {
        this.costData = costData;
        costData.registerObserver(this);
    }

    @Override
    public void update(int cucumber, int tomato, int orange) {
        this.cucumber += cucumber;
        this.tomato += tomato;
        this.orange += orange;
        display();
    }

    @Override
    public void display() {
        System.out.printf("MarketSun - cucumber: %s, tomato: %s, orange: %s\n", cucumber, tomato, orange);
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

    public Observable getCostData() {
        return costData;
    }

    @Override
    public String toString() {
        return "MarketSun{" +
                "cucumber=" + cucumber +
                ", tomato=" + tomato +
                ", orange=" + orange ;
    }
}

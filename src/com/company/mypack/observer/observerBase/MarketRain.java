package com.company.mypack.observer.observerBase;

public class MarketRain implements Observer, Display {
    private int cucumber = 1000;
    private int tomato = 2000;
    private int orange = 1000000;
    private Observable costData;

    MarketRain(CostData costData) {
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
        System.out.printf("MarketRain - cucumber: %s, tomato: %s, orange: %s\n", cucumber, tomato, orange);
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
        return "MarketRain{" +
                "cucumber=" + cucumber +
                ", tomato=" + tomato +
                ", orange=" + orange;
    }
}
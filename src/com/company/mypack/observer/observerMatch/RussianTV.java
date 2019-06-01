package com.company.mypack.observer.observerMatch;

public class RussianTV implements Observer, Display {

    private int left, right;
    private Match match;

    RussianTV(Match match) {
        this.match = match;
    }

    @Override
    public void display() {
        System.out.printf("CountingRU  –  %d : %d\n", left, right);
    }

    @Override
    public void update(int left, int right) {
        this.left = left;
        this.right = right;
        display();
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public Match getMatch() {
        return match;
    }
}

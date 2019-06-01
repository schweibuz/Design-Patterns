package com.company.mypack.observer.observerMatch;

import java.util.ArrayList;

public class Match implements Observable {

    private ArrayList<Observer> listObservers;
    private int left, right;

    Match() {
        listObservers = new ArrayList<Observer>();
    }

    public void setCounting(int left, int right) {
        this.left = left;
        this.right = right;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer o) {
        listObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = listObservers.indexOf(o);
        if (i >= 0) {
            listObservers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o : listObservers) {
            o.update(left, right);
        }
    }

    public ArrayList<Observer> getListObservers() {
        return listObservers;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }
}

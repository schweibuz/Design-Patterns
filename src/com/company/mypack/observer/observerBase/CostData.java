package com.company.mypack.observer.observerBase;

import java.util.ArrayList;
import java.util.List;

public class CostData implements Observable {

    List <Observer> list;
    private int cucumber;
    private int tomato;
    private int orange;

    CostData() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++){
            Observer observer = list.get(i);
            observer.update(cucumber, tomato, orange);
        }
    }

    public void costChanged() {
        notifyObserver();
    }

    public void setCost(int cucumber, int tomato, int orange) {
        this.cucumber = cucumber;
        this.tomato = tomato;
        this.orange = orange;
        costChanged();
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

    public List<Observer> getList() {
        return list;
    }

    @Override
    public String toString() {
        return "CostData{" +
                "list=" + list +
                ", cucumber=" + cucumber +
                ", tomato=" + tomato +
                ", orange=" + orange +
                '}';
    }
}

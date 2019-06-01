package com.company.mypack.observer.observerMatch;

public interface Observable {
    public void addObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}

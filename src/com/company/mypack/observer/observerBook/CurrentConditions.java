package com.company.mypack.observer.observerBook;

public class CurrentConditions implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " +
        humidity + "% humidity");
    }

    public CurrentConditions(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}

package com.sv.in.designspattern.observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    private int temperature;
    private List<Observer> observers=new ArrayList<>();

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObserver();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    private void notifyObserver() {
        for (Observer observer:observers) {
            observer.update(temperature);
        }
    }
}

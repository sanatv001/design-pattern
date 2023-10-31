package com.sv.in.designspattern.observable;

public class TempMain {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        TemperatureDisplay temperatureDisplay=new TemperatureDisplay();
        Fan fan=new Fan();
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(fan);
        weatherStation.setTemperature(25);
        weatherStation.setTemperature(32);
    }
}

package com.sv.in.designspattern.observable;

public class TemperatureDisplay implements Observer{
    @Override
    public void update(int temprature) {
        System.out.println("Temperature Display: Temperature is now "+ temprature + " degree Celsius");
    }


}

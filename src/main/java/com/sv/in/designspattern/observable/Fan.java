package com.sv.in.designspattern.observable;

public class Fan implements Observer{
    @Override
    public void update(int temprature) {
        if(temprature>30){
            System.out.println("Fan: It's too hot! Turning on the fan.");
        }
        else {
            System.out.println("Fan: It's cool. Turning off the fan.");
        }
    }
}

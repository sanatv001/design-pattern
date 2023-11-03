package com.sv.in.designspattern.adapter;

public class AdapterPatternMain {
    public static void main(String[] args) {

//        Example: Adapter Pattern for Web Service Integration
//        Suppose you need to integrate a third-party web service, which provides data in a format that
//        doesn't match your application's requirements. You can create an adapter to make the third-party
//        service compatible with your application.Let's consider a simplified scenario where you need to adapt a weather service:

        ExternalWeatherService externalService = new ExternalWeatherService();
        WeatherService weatherService = new WeatherServiceAdapter(externalService);

        System.out.println("Temperature: " + weatherService.getTemperature());
        System.out.println("Conditions: " + weatherService.getConditions());
    }
        }

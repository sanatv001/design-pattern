package com.sv.in.designspattern.adapter;

public class WeatherServiceAdapter implements WeatherService{
    private ExternalWeatherService externalService;

    public WeatherServiceAdapter(ExternalWeatherService externalService) {
        this.externalService = externalService;
    }

    @Override
    public String getTemperature() {
        String data=externalService.getWeatherData();
        return data.split(",")[0].trim();
    }

    @Override
    public String getConditions() {
        String data = externalService.getWeatherData();
        return data.split(",")[1].trim();
    }
}

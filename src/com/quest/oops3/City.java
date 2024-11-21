package com.quest.oops3;

public class City extends Weather {

    // Constructor
    public City(String name, double temperature, int humidity, String condition) {
        super(name, temperature, humidity, condition); // Call the Weather constructor
    }


    @Override
    public void updateWeather(double temperature, int humidity, String condition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    @Override
    public String displayWeather() {
        return "City: " + name + ", Temperature: " + temperature + "°C, Humidity: " + humidity + "%, Condition: " + condition;
    }
}

package com.quest.oops3;
public abstract class Weather {
    String name;
    double temperature;
    int humidity;
    String condition;

    // Constructor
    public Weather(String name, double temperature, int humidity, String condition) {
        this.name = name;
        this.temperature = temperature;
        this.humidity = humidity;
        this.condition = condition;
    }

    // Getter for city name
    public String getName() {
        return name;
    }

    // Getter for temperature
    public double getTemperature() {
        return temperature;
    }

    // Getter for humidity
    public int getHumidity() {
        return humidity;
    }

    // Abstract methods for updating and displaying weather
    public abstract void updateWeather(double temperature, int humidity, String condition);

    public abstract String displayWeather();
}

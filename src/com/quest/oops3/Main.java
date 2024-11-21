package com.quest.oops3;

public class Main {
    public static void main(String[] args) {
        WeatherMonitoring monitoringSystem = new WeatherMonitoring(5);

        monitoringSystem.addCity(new City("New York", 22.5, 65, "Sunny"));
        monitoringSystem.addCity(new City("Tokyo", 18.0, 80, "Rainy"));
        monitoringSystem.addCity(new City("Dubai", 43.0, 25, "Sunny"));

        monitoringSystem.displayCityWeather("Tokyo");

        monitoringSystem.updateCityWeather("Tokyo", 30.0, 55, "Cloudy");

        monitoringSystem.findExtremes();

        monitoringSystem.displayHighHumidityCities();

        monitoringSystem.generateReports();

        monitoringSystem.checkAlerts();
    }
}

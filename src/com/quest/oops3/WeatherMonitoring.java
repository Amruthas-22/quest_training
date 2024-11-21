package com.quest.oops3;

public class WeatherMonitoring {
    private Weather[] cities;
    private int cityCount;

    // Constructor
    public WeatherMonitoring(int maxCities) {
        cities = new Weather[maxCities];
        cityCount = 0;
    }

    // Add a city
    public void addCity(Weather city) {
        if (cityCount < cities.length) {
            cities[cityCount++] = city;
        } else {
            System.out.println("Error: Cannot add more cities. The list is full.");
        }
    }

    // Update weather
    public void updateCityWeather(String cityName, double newTemperature, int newHumidity, String newCondition) {
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getName().equalsIgnoreCase(cityName)) {
                cities[i].updateWeather(newTemperature, newHumidity, newCondition);
                System.out.println("Weather updated for " + cityName);
                return;
            }
        }
        System.out.println("City not found: " + cityName);
    }

    // Display weather for a specific city
    public void displayCityWeather(String cityName) {
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getName().equalsIgnoreCase(cityName)) {
                System.out.println(cities[i].displayWeather());
                return;
            }
        }
        System.out.println("City not found: " + cityName);
    }

    // Find cities with the highest and lowest temperatures
    public void findExtremes() {
        if (cityCount == 0) {
            System.out.println("No cities to analyze.");
            return;
        }

        Weather highestTempCity = cities[0];
        Weather lowestTempCity = cities[0];

        for (int i = 1; i < cityCount; i++) {
            if (cities[i].getTemperature() > highestTempCity.getTemperature()) {
                highestTempCity = cities[i];
            }
            if (cities[i].getTemperature() < lowestTempCity.getTemperature()) {
                lowestTempCity = cities[i];
            }
        }

        System.out.println("City with the Highest Temperature: " + highestTempCity.getName() + " (" + highestTempCity.getTemperature() + "°C)");
        System.out.println("City with the Lowest Temperature: " + lowestTempCity.getName() + " (" + lowestTempCity.getTemperature() + "°C)");
    }

    // Display cities with humidity greater than 80%
    public void displayHighHumidityCities() {
        boolean found = false;
        System.out.println("\nCities with Humidity > 80%:");
        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getHumidity() > 80) {
                System.out.println(cities[i].displayWeather());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No cities with humidity > 80%.");
        }
    }

    // Generate reports (average temperature)
    public void generateReports() {
        System.out.println("\nGenerating Reports...");

        double totalTemperature = 0;
        for (int i = 0; i < cityCount; i++) {
            totalTemperature += cities[i].getTemperature();
        }
        double averageTemperature = totalTemperature / cityCount;
        System.out.println("\nAverage Temperature: " + String.format("%.2f", averageTemperature) + "°C");
    }

    // Display alerts based on temperature and humidity
    public void checkAlerts() {
        System.out.println("\nAlerts:");

        for (int i = 0; i < cityCount; i++) {
            if (cities[i].getTemperature() > 40) {
                System.out.println("Heatwave Alert: " + cities[i].getName() + " is experiencing extreme heat (" + cities[i].getTemperature() + "°C)!");
            }
            if (cities[i].getHumidity() < 20) {
                System.out.println("Low Humidity Warning: " + cities[i].getName() + " is experiencing low humidity (" + cities[i].getHumidity() + "%)!");
            }
        }
    }
}

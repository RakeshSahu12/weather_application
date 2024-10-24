package com.nt.dto;

import com.nt.model.WeatherData;
import java.util.List;

public class WeatherResponse {
    private WeatherData main;
    private String name;
    private List<WeatherCondition> weather; 

    // Getters and Setters
    public WeatherData getMain() {
        return main;
    }

    public void setMain(WeatherData main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<WeatherCondition> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherCondition> weather) {
        this.weather = weather;
    }

    // Inner class to match the API response for weather condition
    public static class WeatherCondition {
        private String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

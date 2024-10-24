package com.nt.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.nt.dto.WeatherResponse;

@Service
public class WeatherService {
    private final String API_KEY = "c372e0ab2d6476bc4095531eef12ce3c"; // Replace with your actual API key
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid=" + API_KEY + "&units=metric";

    public WeatherResponse getWeather(String city) throws HttpClientErrorException {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(BASE_URL, WeatherResponse.class, city);
    }
}

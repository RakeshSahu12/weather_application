package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpClientErrorException;

import com.nt.dto.WeatherResponse;
import com.nt.service.WeatherService;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam(name = "city" , required = false) String city, Model model) {
        try {
            WeatherResponse weatherResponse = weatherService.getWeather(city);
            model.addAttribute("weather", weatherResponse);
        } catch (HttpClientErrorException e) {
            model.addAttribute("error", "Location not found. Please try a different city.");
        }
        return "weather-summary"; // Corresponding Thymeleaf template
    }
}

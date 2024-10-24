package com.nt.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.WeatherData;

public interface WeatherRepository extends JpaRepository<WeatherData, Long> {
    List<WeatherData> findByCityAndDateBetween(String city, LocalDateTime startDate, LocalDateTime endDate);
}

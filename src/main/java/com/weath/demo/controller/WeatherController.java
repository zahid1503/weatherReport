package com.weath.demo.controller;

import com.weath.demo.entity.Weather;
import com.weath.demo.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class WeatherController {

    @Autowired
    private IWeatherService weatherService;


    @GetMapping("/weather/{city}")
    public ResponseEntity<Weather> getWeatherByCity(@PathVariable String city) {
        Weather weather = weatherService.getWeatherByCity(city);
       return  ResponseEntity.ok().body(weather);
    }
}

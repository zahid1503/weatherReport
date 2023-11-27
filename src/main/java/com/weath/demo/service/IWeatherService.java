package com.weath.demo.service;

import com.weath.demo.entity.Weather;

import java.util.List;
import java.util.Optional;

public interface IWeatherService {
    public Weather getWeatherByCity(String city);
    //public List<Weather> getHourlyForecast(String city);
}

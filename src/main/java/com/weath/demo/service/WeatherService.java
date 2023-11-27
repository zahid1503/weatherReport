package com.weath.demo.service;

import com.weath.demo.entity.Weather;
import com.weath.demo.repository.WeatherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class WeatherService implements IWeatherService{

//    @Value("")
    private String apiKey = "ae8079fcdd9bd990eca07a3d75161fa7";

    private final String baseUrl = "http://api.openweathermap.org/data/2.5";

    @Autowired
    private WeatherRepository weatherRepository;

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public Weather getWeatherByCity(String city) {


        Optional<Weather> optionalWeather = weatherRepository.findByName(city);
        if (optionalWeather.isPresent()) {
            return optionalWeather.get();
        } else {

            Weather newWeather = getCurrentWeather(city);


            weatherRepository.save(newWeather);

            return newWeather;
        }
    }

    public Weather getCurrentWeather(String city) {

        // https://api.openweathermap.org/data/2.5/weather?q=hyderabad&appid=ae8079fcdd9bd990eca07a3d75161fa7
        String url = baseUrl + "/weather?q=hyderabad&appid=ae8079fcdd9bd990eca07a3d75161fa7";


        return restTemplate.getForObject(url, Weather.class);
    }




}

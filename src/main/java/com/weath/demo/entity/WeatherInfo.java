package com.weath.demo.entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class WeatherInfo {


    private Long weatherInfo_id;

    private String main;
    private String description;
    private String icon;

}

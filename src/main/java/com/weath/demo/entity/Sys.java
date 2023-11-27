package com.weath.demo.entity;


import jakarta.persistence.Embeddable;

@Embeddable
public class Sys {
    private Integer type;

    private String country;
    private long sunrise;
    private long sunset;
}

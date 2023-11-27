package com.weath.demo.entity;



import jakarta.persistence.Embeddable;

@Embeddable
public class Wind {
    private double speed;
    private int deg;
    private double gust;
}

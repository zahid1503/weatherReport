package com.weath.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Coord {
    private double lon;
    private double lat;
}

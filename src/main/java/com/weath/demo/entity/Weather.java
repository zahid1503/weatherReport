package com.weath.demo.entity;

import com.sun.tools.javac.Main;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "weather")
public class Weather {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Embedded
        private Coord coord;


        private String base;


        private int visibility;

        @Embedded
        private Wind wind;

        @Embedded
        private Rain rain;

        @Embedded
        private Clouds clouds;

        private long dt;

        @Embedded
        private Sys sys;

        private int timezone;


        private String name;

        private int cod;

    @Column(name = "timeStamp")
    private LocalDateTime timeStamp;


}

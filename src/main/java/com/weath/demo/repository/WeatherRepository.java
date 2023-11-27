package com.weath.demo.repository;

import com.weath.demo.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WeatherRepository extends JpaRepository<Weather,Long> {
    Optional<Weather> findByName(String city);

}

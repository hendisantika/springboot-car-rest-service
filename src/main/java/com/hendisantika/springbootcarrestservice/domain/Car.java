package com.hendisantika.springbootcarrestservice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/02/20
 * Time: 17.41
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String brand;
    private String model;
    private String color;
    private String fuel;
    private int year;

    public Car(String brand, String model, String color, String fuel, int year) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.fuel = fuel;
        this.year = year;
    }
}

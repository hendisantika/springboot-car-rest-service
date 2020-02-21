package com.hendisantika.springbootcarrestservice.controller;

import com.hendisantika.springbootcarrestservice.domain.Car;
import com.hendisantika.springbootcarrestservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/02/20
 * Time: 17.45
 */
@RestController
@RequestMapping("/api/cars")
public class CarController {
    @Autowired
    private CarRepository carRepository;

    @GetMapping
    Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<Car> getCarById(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

}

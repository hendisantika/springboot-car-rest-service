package com.hendisantika.springbootcarrestservice.controller;

import com.hendisantika.springbootcarrestservice.domain.Car;
import com.hendisantika.springbootcarrestservice.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@RequiredArgsConstructor
public class CarController {
    private final CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") String id) {
        return carRepository.findById(Long.parseLong(id));
    }

    @PostMapping
    public ResponseEntity<Car> addNewCar(@RequestBody Car car) {
        Car car1 = carRepository.save(car);
        return new ResponseEntity<>(car1, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable("id") Long id) {
        carRepository.deleteById(id);
    }

}

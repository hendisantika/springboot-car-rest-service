package com.hendisantika.springbootcarrestservice.repository;

import com.hendisantika.springbootcarrestservice.domain.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/02/20
 * Time: 17.43
 */
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByBrand(@Param("brand") String brand);

    List<Car> findByModel(@Param("model") String model);

    List<Car> findByFuel(@Param("fuel") String fuel);

    List<Car> findByColor(@Param("color") String color);

    List<Car> findByYear(@Param("year") int year);

}

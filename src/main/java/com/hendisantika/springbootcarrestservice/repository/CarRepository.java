package com.hendisantika.springbootcarrestservice.repository;

import com.hendisantika.springbootcarrestservice.domain.Car;
import org.springframework.data.repository.CrudRepository;

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
}

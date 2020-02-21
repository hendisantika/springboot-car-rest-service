package com.hendisantika.springbootcarrestservice;

import com.hendisantika.springbootcarrestservice.domain.Car;
import com.hendisantika.springbootcarrestservice.repository.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootCarRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCarRestServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return (args) -> {
            repository.save(new Car("Ford", "Modeo", "Red", "Diesel", 2013));
            repository.save(new Car("Ford", "Everest", "Red", "Diesel", 2013));
            repository.save(new Car("Alfa Romeo", "Spider", "Black", "B98", 2016));
            repository.save(new Car("Mercedes-Benz", "180", "Silver", "Diesel", 2011));
            repository.save(new Car("Mercedes-Benz", "A", "Red", "A95", 2017));
            repository.save(new Car("Audi", "A3", "Black", "A95", 2014));
            repository.save(new Car("Toyota", "Auris", "Black", "A95", 2013));
            repository.save(new Car("Toyota", "Avensis", "White", "Diesel", 2015));
            repository.save(new Car("Toyota", "Avanza", "White", "Diesel", 2015));
            repository.save(new Car("Toyota", "Fortuner", "White", "Diesel", 2015));
            repository.save(new Car("Toyota", "Innnova", "Black", "Diesel", 2015));
            repository.save(new Car("Toyota", "Rush", "Black", "Diesel", 2015));
            repository.save(new Car("Daihatsu", "Xenia", "Black", "Gas", 2015));
            repository.save(new Car("Daihatsu", "Luxio", "Silver", "Gas", 2015));
            repository.save(new Car("Nissan", "Micra", "Purple", "A95", 2015));
            repository.save(new Car("Nissan", "X-Trail", "Blue", "Diesel", 2016));
            repository.save(new Car("Suzuki", "APV", "Silver", "Gas", 2016));
            repository.save(new Car("Suzuki", "Swift", "Red", "Gas", 2012));
            repository.save(new Car("Suzuki", "Karimun", "Silver", "Gas", 2012));
            repository.save(new Car("Honda", "Freed", "Silver", "Gas", 2012));
            repository.save(new Car("Honda", "CR-V", "Silver", "Gas", 2014));
        };
    }
}

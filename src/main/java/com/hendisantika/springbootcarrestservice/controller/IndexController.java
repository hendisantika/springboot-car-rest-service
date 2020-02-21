package com.hendisantika.springbootcarrestservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-car-rest-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 21/02/20
 * Time: 17.44
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String index() {
        return "Hello World!<br>Cars REST API -  " + new Date();
    }
}
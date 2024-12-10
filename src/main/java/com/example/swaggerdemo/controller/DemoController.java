package com.example.swaggerdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController
// @RequestMapping("/api")
public class DemoController {
    // hello world

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

}

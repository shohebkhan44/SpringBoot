package com.example.journalApplication.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {


    @GetMapping("healthcheck")
    public String HealthCheck(){
        return "everthing is fine";
    }
}

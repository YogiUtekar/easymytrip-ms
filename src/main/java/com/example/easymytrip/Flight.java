package com.example.easymytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Flight {

    @GetMapping("/myFlight")
    public String getData(){
        return("Hello there, welcome to myFlight");
    }
}

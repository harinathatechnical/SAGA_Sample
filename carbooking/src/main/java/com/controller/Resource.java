package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Resource {

    @GetMapping("/carBook")
    public String carBooking(){
        return "CAR BOOKED";
    }
    @GetMapping("/carCancel")
    public String carCancelBooking(){
        return "CAR BOOKING CANCELLED";
    }

    @GetMapping("/CarFailed")
    public String carFailedBooking(){
        return "CAR BOOKING FAILED";
    }
}

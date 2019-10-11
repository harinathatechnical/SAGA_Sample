package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Resource {

    @GetMapping("/flightBook")
    public String flightBooking(){
        return "FLIGHT BOOKED";
    }

    @GetMapping("/flightCancel")
    public String flightCancelBooking(){
        return "FLIGHT BOOKING CANCELLED";
    }

    @GetMapping("/flightFailed")
    public String flightFailedBooking(){
        return "FLIGHT BOOKING FAILED";
    }
}

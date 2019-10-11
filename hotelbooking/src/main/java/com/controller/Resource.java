package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Resource {

    @GetMapping("/hotelBook")
    public String hotelBooking(){
        return "HOTEL BOOKED";
    }

    @GetMapping("/hotelCancel")
    public String hotelCancelBooking(){
        return "HOTEL BOOKING CANCELLED";
    }

    @GetMapping("/hotelFailed")
    public String hotelFailedBooking(){
        return "HOTEL BOOKING FAILED";
    }
}

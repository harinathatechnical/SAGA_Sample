package com.test;

public class Main {

    public static void main(String[] args) {
       // successCase();
      //  problemCase();
       // SAGA.Orchestration();
        SAGA.Choreography();
    }


    public static void successCase(){
        CarServiceClient.callCarService("carBook");
        HotelServiceClient.callHotelService("hotelBook");
        FlightServiceClient.callFlightService("flightBook");
    }

    public static void problemCase(){
        CarServiceClient.callCarService("carBook");
        HotelServiceClient.callHotelService("hotelBook");
        FlightServiceClient.callFlightService("flightFailed");
    }
}

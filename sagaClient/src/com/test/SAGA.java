package com.test;

public class SAGA {

    public static void Orchestration(){
        CarServiceClient.callCarService("carBook");
        HotelServiceClient.callHotelService("hotelBook");
        String res = FlightServiceClient.callFlightService("flightFailed");
        if(res.equalsIgnoreCase("FLIGHT BOOKING FAILED")){
            CarServiceClient.callCarService("carCancel");
            HotelServiceClient.callHotelService("hotelCancel");
        }
    }
    public static void Choreography(){
        CarServiceClient.callCarService("carBook");
        HotelServiceClient.callHotelService("hotelBook");
        String res = FlightServiceClient.callFlightService("flightFailed");
        carListner(res);
        hotelListner(res);
    }

    private static void carListner(String res){
        if("FLIGHT BOOKING FAILED".equalsIgnoreCase(res)){
            CarServiceClient.callCarService("carCancel");
           }

    }
    private static void hotelListner(String res){

        if("FLIGHT BOOKING FAILED".equalsIgnoreCase(res)){
            HotelServiceClient.callHotelService("hotelCancel");
        }
    }
}

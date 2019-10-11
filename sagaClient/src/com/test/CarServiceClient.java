package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class CarServiceClient {

    public static String callCarService(String req){
        String output = null;
        try{
            URL url = new URL("http://localhost:8081/api/"+req);
            //System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            output =  br.lines().collect(Collectors.joining());
            System.out.println(output);
            conn.disconnect();
        } catch (
                MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return output;
    }

    public CarServiceClient carService(String req){
        return new CarServiceClient();
    }
    private void onSuccess(){
        callCarService("carBook");
    }
    private void onError(String input){
        callCarService("carCancel");
    }

    }



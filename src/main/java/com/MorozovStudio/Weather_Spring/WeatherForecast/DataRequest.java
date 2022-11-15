package com.MorozovStudio.Weather_Spring.WeatherForecast;

import com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData.WeatherData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DataRequest {
    final static String API_KEY = "d13d01f6afdf389f7f3467018da0d4e6";

    public static WeatherData getWeather(String city) throws IOException {
        String requestUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&lang=ru&appid=" + API_KEY;
        String response = getJson(requestUrl);;
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(response, WeatherData.class);
    }

    private static String getJson(String requestUrl) throws IOException {
        URL url = new URL(requestUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        BufferedReader in = new BufferedReader(
                new InputStreamReader(connection.getInputStream()));
        String inputLine;
        StringBuffer result = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            result.append(inputLine);
        }
        in.close();
        connection.disconnect();
        String response = result.toString().replaceAll("\\[", "").replaceAll("\\]", "");
        return response;
    }

}

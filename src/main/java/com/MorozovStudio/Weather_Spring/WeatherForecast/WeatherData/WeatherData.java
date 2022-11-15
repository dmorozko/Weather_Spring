package com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class WeatherData {
    //City geo location, longitude and latitude
    @SerializedName("coord")
    private Coordinate coordinate;
    //Weather condition info
    @SerializedName("weather")
    private Weather weather;
    //Internal parameter
    @SerializedName("base")
    private String base;
    //Temperature info
    @SerializedName("main")
    private Temperature temperature;
    //Visibility, meter. The maximum value of the visibility is 10km
    @SerializedName("visibility")
    private int visability;
    //Wind info
    @SerializedName("wind")
    private Wind wind;
    //Cloudiness, %
    @SerializedName("clouds")
    private Clouds clouds;
    //Time of data calculation, unix
    @SerializedName("dt")
    private int dt;
    //Shift in seconds from UTC
    @SerializedName("timezone")
    private int timezone;
    //City name
    @SerializedName("name")
    private String name;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getBase() {
        return base;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public int getVisability() {
        return visability;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Date getDt() {
        return new Date((long)dt*1000);
    }

    public int getTimezone() {
        return timezone;
    }

    public String getName() {
        return name;
    }

    public String getData() {
        String response = "Date: " + getDt() + "\n"
                + "City: " + getName() + "\n"
                + "Current temp: " + getTemperature().getTemp() + "\n"
                + "Feels like: " + getTemperature().getFeels_like() + "\n"
                + "Weather: " + getWeather().getDescription();
        return response;
    }
}


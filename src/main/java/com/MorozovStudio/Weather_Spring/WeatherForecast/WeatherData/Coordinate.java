package com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData;

import com.google.gson.annotations.SerializedName;

public class Coordinate {
    @SerializedName("lat")
    private double lat;
    @SerializedName("lon")
    private double lon;

    public Coordinate(double lat, double lon) {
        this.lat = lat;
        this.lon = lon;
    }
    public Coordinate(){
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}

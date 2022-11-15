package com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData;

public class Wind {
    //Wind speed. Unit Default: meter/sec
    private double speed;
    //Wind direction, degrees (meteorological)
    private double deg;
    //Wind gust. Unit Default: meter/sec
    private double gust;

    public Wind() {
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDeg() {
        return deg;
    }

    public void setDeg(double deg) {
        this.deg = deg;
    }

    public double getGust() {
        return gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}

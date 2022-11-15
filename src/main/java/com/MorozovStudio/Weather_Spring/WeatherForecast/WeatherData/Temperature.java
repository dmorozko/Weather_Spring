package com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData;

public class Temperature {
    //Temperature
    private double temp;
    //Temperature. This temperature parameter accounts for the human perception of weather.
    private double feels_like;
    //Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data), hPa
    private int pressure;
    //Humidity, %
    private int humidity;
    //Minimum temperature at the moment. This is minimal currently observed temperature (within large megalopolises and urban areas).
    private double temp_min;
    //Maximum temperature at the moment. This is maximal currently observed temperature (within large megalopolises and urban areas).
    private double temp_max;
    // Atmospheric pressure on the sea level, hPa
    private double sea_level;
    //Atmospheric pressure on the ground level, hPa
    private double grnd_level;

    public Temperature() {
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getSea_level() {
        return sea_level;
    }

    public void setSea_level(double sea_level) {
        this.sea_level = sea_level;
    }

    public double getGrnd_level() {
        return grnd_level;
    }

    public void setGrnd_level(double grnd_level) {
        this.grnd_level = grnd_level;
    }
}

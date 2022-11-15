package com.MorozovStudio.Weather_Spring.WeatherForecast.WeatherData;

import com.google.gson.annotations.SerializedName;

public class Clouds {
    @SerializedName("all")
    private int cloudPercentage;

    public int getCloudPercentage() {
        return cloudPercentage;
    }

    public void setCloudPercentage(int cloudPercentage) {
        this.cloudPercentage = cloudPercentage;
    }
}

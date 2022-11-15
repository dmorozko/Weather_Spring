package com.MorozovStudio.Weather_Spring.Controller;

import com.MorozovStudio.Weather_Spring.WeatherForecast.DataRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class DemoController {
    @GetMapping("/")
    public String hello(@RequestParam(value = "city", defaultValue = "Moscow") String city) throws IOException {
        return DataRequest.getWeather(city).getData();
    }
}

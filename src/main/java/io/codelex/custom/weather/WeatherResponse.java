package io.codelex.custom.weather;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class WeatherResponse {
    @JsonProperty("current_weather")
    private Map<String, String> currentWeather = new HashMap<>();

    public WeatherResponse(Map<String, String> currentWeather) {
        this.currentWeather = currentWeather;
    }

    public WeatherResponse() {}

    private Map<String, String> getAllWeatherData() {
        return currentWeather;
    }

    public String getTemperature() {
        return currentWeather.get("temperature");
    }

}

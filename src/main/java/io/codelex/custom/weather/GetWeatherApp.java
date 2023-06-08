package io.codelex.custom.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class GetWeatherApp {

    private static final String IP_API = "https://api.ipify.org/?format=json";
    private static final String LOCATION_API = "http://ip-api.com/json/";
    private static final String LOCATION_API_QUERY = "?fields=city,lat,lon";
    private static final String WEATHER_API = "https://api.open-meteo.com/v1/forecast?latitude=";
    private static final String WEATHER_API_LON = "&longitude=";
    private static final String WEATHER_API_QUERY = "&current_weather=true";

    public static void main(String[] args) {

        System.out.println("Trying to get your ip address...");
        getAPIResponse(IP_API, IPResponse.class)
                .flatMap(ipData -> {
                    System.out.println("...Got your ip! " + ipData.getIp());
                    System.out.println("Trying to get your location...");
                    return getAPIResponse(LOCATION_API + ipData.getIp() + LOCATION_API_QUERY, LocationResponse.class);
                })
                .flatMap(locationData -> {
                    System.out.println("...Got ip location! " + locationData.getCity());
                    System.out.println("Trying to get weather data...");
                    String weatherUrl = WEATHER_API + locationData.getLat()
                            + WEATHER_API_LON + locationData.getLon()
                            + WEATHER_API_QUERY;
                    return getAPIResponse(weatherUrl, WeatherResponse.class);
                })
                .ifPresent(weatherData -> {
                    System.out.println("...Got weather data!");
                    System.out.println("Weather today is " + weatherData.getTemperature() + "°C");
                });
    }

    private static <T> Optional<T> getAPIResponse(String url, Class<T> response) {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            return Optional.ofNullable(mapper
                    .readValue(new URL(url), response));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Optional.empty();
    }
}
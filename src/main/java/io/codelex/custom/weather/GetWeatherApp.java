package io.codelex.custom.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class GetWeatherApp {
    public static void main(String[] args) {

        System.out.println("Trying to get your ip address...");
        getIPResponse().ifPresent(ipData -> {
            System.out.println("...Got your ip! " + ipData.getIp());

            System.out.println("Trying to get your location...");
            getLocationResponse(ipData.getIp()).ifPresent(locationData -> {
                System.out.println("...Got ip location! " + locationData.getCity());

                System.out.println("Trying to get weather data...");
                getWeatherResponse(locationData.getLat(), locationData.getLon()).ifPresent(weatherData -> {

                    System.out.println("...Got weather data!");
                    System.out.println("Weather today in "
                            + locationData.getCity() + " is "
                            + weatherData.getTemperature() + "°C"
                    );
                });
            });
        });
    }


    private static Optional<IPResponse> getIPResponse() {
        String url = ("https://api.ipify.org/?format=json");
        return getAPIResponse(url, IPResponse.class);
    }

    private static Optional<LocationResponse> getLocationResponse(String userIP) {
        String url = "http://ip-api.com/json/" + userIP + "?fields=city,lat,lon";
        return getAPIResponse(url, LocationResponse.class);
    }

    private static Optional<WeatherResponse> getWeatherResponse(String latitude, String longitude) {
        String url = "https://api.open-meteo.com/v1/forecast?latitude="
                + latitude
                + "&longitude=" + longitude
                + "&current_weather=true";
        return getAPIResponse(url, WeatherResponse.class);
    }

    private static <T> Optional<T> getAPIResponse(String url, Class<T> response) {
        try {
            return Optional.ofNullable(getObjectMapper()
                    .readValue(new URL(url), response));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return Optional.empty();
    }

    private static ObjectMapper getObjectMapper() {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
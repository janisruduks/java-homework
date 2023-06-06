package io.codelex.custom.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.codelex.custom.prettifyconsole.PrettifyOutput;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class GetWeatherApp {
    public static void main(String[] args) {

        System.out.println("Trying to get your ip address...");
        getIPResponse().ifPresent(ipData -> {
            System.out.println(PrettifyOutput.chooseColour(
                    "...Got your ip! " + ipData.getIp(), PrettifyOutput.GREEN
            ));

            System.out.println("Trying to get your location...");
            getLocationResponse(ipData.getIp()).ifPresent(locationData -> {
                System.out.println(PrettifyOutput.chooseColour(
                        "...Got ip location! " + locationData.getCity(), PrettifyOutput.GREEN
                ));

                System.out.println("Trying to get weather data...");
                getWeatherResponse(locationData.getLat(), locationData.getLon()).ifPresent(weatherData -> {

                    System.out.println(PrettifyOutput.chooseColour(
                            "...Got weather data!", PrettifyOutput.GREEN
                    ));
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
            System.out.println(PrettifyOutput.chooseColour("Error: " + e.getMessage(), PrettifyOutput.RED));
        }
        return Optional.empty();
    }

    private static ObjectMapper getObjectMapper() {
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
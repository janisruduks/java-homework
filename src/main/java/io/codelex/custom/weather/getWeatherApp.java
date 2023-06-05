package io.codelex.custom.weather;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class getWeather {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        GetIP resp = mapper.readValue(new URL("https://api.ipify.org/?format=json"), GetIP.class);
        System.out.println(resp.getIp());
    }
}

package io.codelex.custom.currencyconverter;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;

public class DemoConv {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        RatesResponse resp = mapper.readValue(new URL("https://api.exchangerate.host/latest"), RatesResponse.class);
    }
}

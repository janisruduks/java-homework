package io.codelex.custom.randompersongenerator;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class RandomPersonGenerator {

    private static final String URL = "https://random-data-api.com/api/users/random_user";

    public static Person getPerson() {
        Optional<Person> optionalPerson = getAPIResponse(URL, Person.class);
        return optionalPerson.get();
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

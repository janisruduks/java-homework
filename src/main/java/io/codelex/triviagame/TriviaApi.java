package io.codelex.triviagame;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class TriviaApi {

    private static final String URL = "http://numbersapi.com/random/trivia?json&?min=0&max=10000000";

    public static TriviaQuestion getTriviaQuestion() {
        Optional<TriviaQuestion> optionalTriviaQuestion = getAPIResponse(URL, TriviaQuestion.class);
        return optionalTriviaQuestion.orElse(null);
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

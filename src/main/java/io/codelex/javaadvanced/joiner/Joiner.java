package io.codelex.javaadvanced.joiner;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    @SafeVarargs
    public final String join(T... objects) {
        List<String> list = Stream.of(objects)
                .map(Objects::toString)
                .toList();
        return String.join(separator, list);
    }
}

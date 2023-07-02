package io.codelex.collections.practice;

import org.apache.commons.lang3.Range;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final String scores = fileContent();
        String[] numbers = scores.split(" ");
        createHistogram(numbers);
        HashMap<Range<Integer>, String> histogram = createHistogram(numbers);
        displayHistogram(histogram);
    }

    private static HashMap<Range<Integer>, String> createHistogram(String[] scores) {
        LinkedHashMap<Range<Integer>, String> histogram = new LinkedHashMap<>();
        int start = 0;
        int end = 9;
        for (int i = 0; i < 11; i++) {
            Range<Integer> range = Range.between(start, end);
            histogram.put(range, "");
            start += 10;
            end += 10;
        }
        for (String number : scores) {
            histogram.forEach((k, v) -> {
                if (k.contains(Integer.valueOf(number))) {
                    histogram.put(k, histogram.get(k) + "*");
                }
            });
        }
        return histogram;
    }

    private static void displayHistogram(HashMap<Range<Integer>, String> histogram) {
        histogram.forEach((k, v) -> {
            if (k.contains(1)) {
                System.out.println("0" + k.getMinimum() + "-" + "0" + k.getMaximum() + ": " + v);
            } else if (k.contains(100)) {
                System.out.println(k.getMinimum() + ": " + v);
            } else {
                System.out.println(k.getMinimum() + "-" + k.getMaximum() + ": " + v);
            }
        });
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }
}

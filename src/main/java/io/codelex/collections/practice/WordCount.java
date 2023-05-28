package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Objects.requireNonNull(Histogram.class.getResource(file)).toURI());
        List<String> text = Files.readAllLines(path, charset);

        System.out.println("Lines = " + text.size());

        System.out.println("Words = " + getWordCount(text));

        System.out.println("Chars = " + getCharacterCount(text));
    }

    private static int getCharacterCount(List<String> text) {
        final int[] charCount = {0};
        text.forEach(element -> {
            char[] lettersAndDigits = element.toCharArray();
            charCount[0] += lettersAndDigits.length;
        });
        return charCount[0];
    }

    private static int getWordCount(List<String> text) {
        final int[] wordCount = {0};
        text.forEach(element -> {
            element = element.strip().replaceAll("\\s+", " ");
            String[] words = element.split(" ");
            wordCount[0] += words.length;
        });
        return wordCount[0];
    }
}

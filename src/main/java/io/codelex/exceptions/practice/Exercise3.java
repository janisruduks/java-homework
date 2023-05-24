package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        cat(new File("/Users/janis/Desktop/hello.txt"));
        cat(new File("world"));
    }

    public static void cat(File file) {

        try {
            String line;
            try (RandomAccessFile input = new RandomAccessFile(file, "r")) {
                while ((line = input.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter path to file e.g. '/Users/name/example.txt'");
        cat(new File(in.next()));
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

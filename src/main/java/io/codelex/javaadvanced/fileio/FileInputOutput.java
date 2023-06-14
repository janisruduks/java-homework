package io.codelex.javaadvanced.fileio;

import java.io.*;
import java.net.URL;

public class FileInputOutput {

    File input;
    File output;

    public FileInputOutput(String input) {
        this.input = new File(input);
        writeToOutput();
    }

    private void writeToOutput() {
        try (BufferedReader br = new BufferedReader(new FileReader(input))) {
            StringBuilder lines = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder(line);
                reversedLine.reverse();
                lines.append(reversedLine);
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                writer.write(reversedLine.toString());

                writer.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

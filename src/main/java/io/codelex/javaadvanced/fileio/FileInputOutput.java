package io.codelex.javaadvanced.fileio;

import java.io.*;

public class FileInputOutput {

    private final File input;
    private final String outputName;
    private static final String FILE_PATH = "src/main/java/io/codelex/javaadvanced/fileio/";

    public FileInputOutput(String fileName) {
        this.input = new File(fileName);
        this.outputName = reverseFileName(fileName);
        writeToOutputReversed();
    }

    private void writeToOutputReversed() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH + input))) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH + outputName));
            String line;
            while ((line = br.readLine()) != null) {
                StringBuilder reversedLine = new StringBuilder(line).reverse();
                writer.write(reversedLine.toString());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String reverseFileName(String fileName) {
        String[] fileNameWithoutExtension = fileName.split("\\.");
        return new StringBuilder(fileNameWithoutExtension[0])
                .reverse()
                .append(".")
                .append(fileNameWithoutExtension[1]).toString();
    }
}

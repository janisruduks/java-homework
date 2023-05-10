package io.codelex.loops.practice;

public class AsciiFigure {
    public static void main(String[] args) {
        System.out.println("The Great Pyramid of Giza");
        pyramid(7);
        pyramid(5);
        pyramid(3);
    }

    public static void pyramid(int width) {
        int starCount = (width - 1) * 8;
        int spaceCount = 0;

        for (int i = 0; i < width; i++) {
            System.out.println(".".repeat(spaceCount) + "@".repeat(starCount) + "#".repeat(spaceCount));
            starCount -= 8;
            spaceCount += 4;
        }

        starCount = 0;
        spaceCount = 4 * (width - 1);

        for (int i = 0; i < width; i++) {
            System.out.println(".".repeat(spaceCount) + "+".repeat(starCount) + "&".repeat(spaceCount));
            starCount += 8;
            spaceCount -= 4;
        }
    }
}

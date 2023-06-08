package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static final VideoStore store = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to rate video (as user)");
            System.out.println("Choose 5 to show video catalog");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard);
                case 2 -> rentVideo(keyboard);
                case 3 -> returnVideo(keyboard);
                case 4 -> rateVideo(keyboard);
                case 5 -> store.getInventory();
                default -> {
                }
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            scanner.nextLine(); // to fix String cutting off by space
            String movieName = scanner.nextLine();

            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            store.addVideoToInventory(movieName, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("What movie do you want to rent?");
        store.getInventory();

        System.out.print("\nEnter title of the movie: ");
        scanner.nextLine();
        String movieTitle = validateMovieTitle(scanner.nextLine(), scanner);
        store.rentVideo(movieTitle);

        thankCustomer(movieTitle);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("What movie do you want to return?");

        System.out.print("\nEnter title of the movie: ");
        scanner.nextLine();
        String movieTitle = validateMovieTitle(scanner.nextLine(), scanner);
        store.returnVideo(movieTitle);

        thankCustomer(movieTitle);
    }

    private static void rateVideo(Scanner scanner) {
        System.out.println("What movie do you want to rate?");
        store.getInventory();

        System.out.print("\nEnter title of the movie: ");
        scanner.nextLine();
        String movieTitle = validateMovieTitle(scanner.nextLine(), scanner);

        System.out.print("Enter rating (1-10): ");
        int rating = scanner.nextInt();
        store.rateVideo(movieTitle, rating);
        System.out.println(store.findVideo(movieTitle));

        thankCustomer(movieTitle);
    }

    private static void thankCustomer(String movieTitle) {
        System.out.println("Action was successfully: " + movieTitle);
        System.out.println("Thanks for renting with us!\n");
    }

    private static String validateMovieTitle(String movieTitle, Scanner scanner) {
        while (store.findVideo(movieTitle) == null) {
            System.out.println("ERROR: Invalid movie title, please try again");
            store.getInventory();
            System.out.print("I better not see a mistake again... : ");
            movieTitle = scanner.nextLine();
        }
        return movieTitle;
    }
}

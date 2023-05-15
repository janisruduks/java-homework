package io.codelex.classesandobjects.practice;

import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Pictures", "PG");

        Movie[] bunchOfMovies = {movie1, movie2, movie3};
        System.out.println(Arrays.toString(movie1.getPG(bunchOfMovies)));
    }
}

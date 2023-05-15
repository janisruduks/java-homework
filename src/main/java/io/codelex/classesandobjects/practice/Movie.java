package io.codelex.classesandobjects.practice;

import java.util.Objects;

public class Movie {
    private final String title;
    private final String studio;
    private final String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this(title, studio, "PG");
    }

    public Movie[] getPG(Movie[] movies) {
        Movie[] pgMovies = new Movie[movies.length + 1];

        int counter = 0;

        for (Movie movie : movies) {
            if (Objects.equals(movie.rating, "PG")) {
                pgMovies[counter] = movie;
                counter++;
            }
        }
        return pgMovies;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", studio='" + studio + '\'' +
                ", rating='" + rating + '\'' +
                '}';
    }
}

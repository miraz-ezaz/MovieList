package org.movielist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieHandler {
    private List<Movie> movies;

    // Constructor
    public MovieHandler() {
        this.movies = new ArrayList<>();
    }

    // Add a movie to the list
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Search movies by title, cast, or category
    public List<Movie> searchMovies(String keyword) {
        return movies.stream()
                .filter(movie -> movie.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                        movie.getCast().stream().anyMatch(actor -> actor.toLowerCase().contains(keyword.toLowerCase())) ||
                        movie.getCategory().toLowerCase().contains(keyword.toLowerCase()))
                .sorted((m1, m2) -> m1.getTitle().compareToIgnoreCase(m2.getTitle()))
                .collect(Collectors.toList());
    }
}

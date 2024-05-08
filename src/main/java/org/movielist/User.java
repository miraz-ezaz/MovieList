package org.movielist;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String email;
    private List<Movie> favoriteMovies;

    // Constructor
    public User(String email) {
        this.email = email;
        this.favoriteMovies = new ArrayList<>();
    }

    // Getters
    public String getEmail() {
        return email;
    }

    public List<Movie> getFavoriteMovies() {
        return favoriteMovies;
    }

    // Add a movie to favorites
    public void addFavoriteMovie(Movie movie) {
        favoriteMovies.add(movie);
    }

    // Remove a movie from favorites
    public void removeFavoriteMovie(Movie movie) {
        favoriteMovies.remove(movie);
    }
}

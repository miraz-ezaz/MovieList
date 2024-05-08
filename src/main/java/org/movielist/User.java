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
}

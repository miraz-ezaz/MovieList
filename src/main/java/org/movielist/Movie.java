package org.movielist;

import java.time.LocalDate;
import java.util.List;

public class Movie {
    private String title;
    private List<String> cast;
    private String category;
    private LocalDate releaseDate;
    private double budget;

    // Constructor
    public Movie(String title, List<String> cast, String category, LocalDate releaseDate, double budget) {
        this.title = title;
        this.cast = cast;
        this.category = category;
        this.releaseDate = releaseDate;
        this.budget = budget;
    }
}


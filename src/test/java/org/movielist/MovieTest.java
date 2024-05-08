/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.movielist;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class MovieTest {

    @Test
    public void testGetTitle() {
        // Arrange
        Movie movie = new Movie("Toy Story 4", null, null, null, 0.0); // Create a movie object

        // Act
        String title = movie.getTitle(); // Attempt to retrieve the title

        // Assert
        assertEquals("Toy Story 4", title); // Check if the retrieved title matches the expected title
    }

    @Test
    public void testMovieDetails() {
        List<String> cast = Arrays.asList("Actor1", "Actor2", "Actor3");
        LocalDate releaseDate = LocalDate.of(2020, 5, 15);
        double budget = 1000000.0;

        Movie movie = new Movie("Movie Title", cast, "Action", releaseDate, budget);

        assertEquals("Movie Title", movie.getTitle());
        assertEquals(cast, movie.getCast());
        assertEquals("Action", movie.getCategory());
        assertEquals(releaseDate, movie.getReleaseDate());
        assertEquals(1000000.0, movie.getBudget(), 0.01);
    }
}

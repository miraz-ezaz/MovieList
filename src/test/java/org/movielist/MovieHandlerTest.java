/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.movielist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class MovieHandlerTest {
    @Test
    public void testAddMovie() {
        // Arrange
        MovieHandler movieHandler = new MovieHandler(); // Create a MovieManager object
        Movie movie = new Movie("Toy Story 4", null, null, null, 0.0); // Create a movie object

        // Act
        movieHandler.addMovie(movie); // Attempt to add the movie

        // Assert
        assertTrue(movieHandler.searchMovies("Toy Story 4").contains(movie)); // Check if the added movie is in the list of movies
    }
    
    
}

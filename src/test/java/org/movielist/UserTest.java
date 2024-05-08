/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.movielist;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author User
 */
public class UserTest {
    @Test
    public void testGetEmail() {
        // Arrange
        User user = new User("test@example.com"); // Create a user object

        // Act
        String email = user.getEmail(); // Attempt to retrieve the email

        // Assert
        assertEquals("test@example.com", email); // Check if the retrieved email matches the expected email
    }

    @Test
    public void testAddAndGetFavoriteMovies() {
        // Arrange
        User user = new User("test@example.com"); // Create a user object
        Movie movie1 = new Movie("Movie 1", null, null, null, 0.0); // Create a movie object
        Movie movie2 = new Movie("Movie 2", null, null, null, 0.0); // Create another movie object

        // Act
        user.addFavoriteMovie(movie1); // Add movie1 to favorites
        user.addFavoriteMovie(movie2); // Add movie2 to favorites
        List<Movie> favorites = user.getFavoriteMovies(); // Retrieve the list of favorite movies

        // Assert
        assertEquals(2, favorites.size()); // Check if the number of favorite movies is correct
        assertTrue(favorites.contains(movie1)); // Check if movie1 is in the list of favorites
        assertTrue(favorites.contains(movie2)); // Check if movie2 is in the list of favorites
    }
    
}

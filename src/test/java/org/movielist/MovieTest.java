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
}

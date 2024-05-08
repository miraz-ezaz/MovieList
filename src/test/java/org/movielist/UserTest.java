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
    
    
}

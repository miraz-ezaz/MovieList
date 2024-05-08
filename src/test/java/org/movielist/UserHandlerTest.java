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
public class UserHandlerTest {
    @Test
    public void testRegisterUser() {
        // Arrange
        UserHandler userHandler = new UserHandler(); // Create a UserHandler object
        User user = new User("test@example.com"); // Create a user object to register

        // Act
        userHandler.registerUser(user); // Attempt to register the user

        // Assert
        assertTrue(userHandler.getUsers().contains(user)); // Check if the registered user is in the list of users
    }
    
    
}

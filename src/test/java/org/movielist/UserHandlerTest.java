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
    @Test
    public void testGetUserByEmail() {
        // Arrange
        UserHandler userHandler = new UserHandler(); // Create a UserHandler object
        User user1 = new User("test1@example.com"); // Create users
        User user2 = new User("test2@example.com");
        User user3 = new User("test3@example.com");
        userHandler.registerUser(user1); // Register users
        userHandler.registerUser(user2);
        userHandler.registerUser(user3);

        // Act
        User foundUser = userHandler.getUserByEmail("test2@example.com"); // Attempt to get a user by email

        // Assert
        assertNotNull(foundUser); // Check if a user with the specified email is found
        assertEquals("test2@example.com", foundUser.getEmail()); // Check if the retrieved user has the correct email
    }
    
}

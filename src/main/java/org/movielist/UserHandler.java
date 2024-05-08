package org.movielist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserHandler {
    private List<User> users;

    public UserHandler() {
        this.users = new ArrayList<>();
    }

    // Register a new user
    public void registerUser(User user) {
        users.add(user);
    }

    // Get the list of users
    public List<User> getUsers() {
        return users;
    }
}

package org.movielist;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static MovieHandler movieManager = new MovieHandler();
    private static UserHandler userManager = new UserHandler();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding sample movies
        addSampleMovies();
        boolean exit = false;

        while (!exit) {
            System.out.println("===== Movie Listing Application =====");
            System.out.println("1. Register");
            System.out.println("2. Search Movies");
            System.out.println("3. View Movie Details");
            System.out.println("4. Add Movie to Favorites");
            System.out.println("5. Remove Movie from Favorites");
            System.out.println("6. View Personal Details and Favorites");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    registerUser();
                    break;
                case 2:
                    searchMovies();
                    break;
                case 3:
                    viewMovieDetails();
                    break;
                case 4:
                    addMovieToFavorites();
                    break;
                case 5:
                    removeMovieFromFavorites();
                    break;
                case 6:
                    viewPersonalDetailsAndFavorites();
                    break;
                case 7:
                    exit = true;
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }

        scanner.close();
    }
    private static void addSampleMovies() {
        List<String> cast1 = Arrays.asList("Tom Hanks", "Tim Allen", "Joan Cusack");
        Movie movie1 = new Movie("Toy Story 4", cast1, "Animation", LocalDate.of(2019, 6, 21), 200000000.0);
        movieManager.addMovie(movie1);

        List<String> cast2 = Arrays.asList("Robert Downey Jr.", "Chris Hemsworth", "Scarlett Johansson");
        Movie movie2 = new Movie("Avengers: Endgame", cast2, "Action", LocalDate.of(2019, 4, 26), 356000000.0);
        movieManager.addMovie(movie2);

        List<String> cast3 = Arrays.asList("Chris Pratt", "Elizabeth Banks", "Will Arnett");
        Movie movie3 = new Movie("The Lego Movie", cast3, "Animation", LocalDate.of(2014, 2, 7), 60000000.0);
        movieManager.addMovie(movie3);
    }

    private static void registerUser() {
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        User newUser = new User(email);
        userManager.registerUser(newUser);
        System.out.println("Registration successful!");
    }

    private static void searchMovies() {
        System.out.print("Enter keyword to search movies: ");
        String keyword = scanner.nextLine();
        movieManager.searchMovies(keyword).forEach(movie -> System.out.println(movie.getTitle()));
    }

    private static void viewMovieDetails() {
        System.out.print("Enter the title of the movie: ");
        String title = scanner.nextLine();
        List<Movie> searchResult = movieManager.searchMovies(title);
        if (!searchResult.isEmpty()) {
            Movie movie = searchResult.get(0); // Assuming there's only one movie with the title
            System.out.println("Title: " + movie.getTitle());
            System.out.println("Cast: " + String.join(", ", movie.getCast()));
            System.out.println("Category: " + movie.getCategory());
            System.out.println("Release Date: " + movie.getReleaseDate());
            System.out.println("Budget: $" + movie.getBudget());
        } else {
            System.out.println("Movie not found!");
        }
    }

    private static void addMovieToFavorites() {
        System.out.print("Enter the email address: ");
        String email = scanner.nextLine();
        User user = userManager.getUserByEmail(email);
        if (user != null) {
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            List<Movie> searchResult = movieManager.searchMovies(title);
            if (!searchResult.isEmpty()) {
                Movie movieToAdd = searchResult.get(0); // Assuming there's only one movie with the title
                if (!user.getFavoriteMovies().contains(movieToAdd)) { // Check if the movie is not already in favorites
                    user.addFavoriteMovie(movieToAdd);
                    System.out.println("Movie added to favorites successfully!");
                } else {
                    System.out.println("Movie is already in favorites!");
                }
            } else {
                System.out.println("Movie not found!");
            }
        } else {
            System.out.println("User not found!");
        }
    }


    private static void removeMovieFromFavorites() {
        System.out.print("Enter the email address: ");
        String email = scanner.nextLine();
        User user = userManager.getUserByEmail(email);
        if (user != null) {
            System.out.print("Enter the title of the movie: ");
            String title = scanner.nextLine();
            List<Movie> searchResult = movieManager.searchMovies(title);
            if (!searchResult.isEmpty()) {
                Movie movie = searchResult.get(0); // Assuming there's only one movie with the title
                user.removeFavoriteMovie(movie);
                System.out.println("Movie removed from favorites!");
            } else {
                System.out.println("Movie not found!");
            }
        } else {
            System.out.println("User not found!");
        }
    }

    private static void viewPersonalDetailsAndFavorites() {
        System.out.print("Enter the email address: ");
        String email = scanner.nextLine();
        User user = userManager.getUserByEmail(email);
        if (user != null) {
            System.out.println("Email: " + user.getEmail());
            System.out.println("Favorite Movies:");
            user.getFavoriteMovies().forEach(movie -> System.out.println(movie.getTitle()));
        } else {
            System.out.println("User not found!");
        }
    }

}

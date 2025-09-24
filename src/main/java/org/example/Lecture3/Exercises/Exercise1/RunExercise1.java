package org.example.Lecture3.Exercises.Exercise1;

public class RunExercise1 {
    public static void main(String[] args) {
        Movie harryPotter = new Movie("Harry Potter", "Fantasy", 5);
        Movie starWars = new Movie("Star Wars", "Sci-Fi", 7);
        Movie theGodfather = new Movie("The Godfather", "Crime", 10);
        Movie toyStory = new Movie("Toy Story", "Animation", 8.7);

        harryPotter.displayDetails();
        starWars.displayDetails();
        theGodfather.displayDetails();
        toyStory.displayDetails();
    }
}

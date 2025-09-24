package org.example.Lecture3.Exercises.Exercise1;

public class Movie {
    String title;
    String genre;
    double rating;
    String ratingString;

    public Movie(String title, String genre, double rating){
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void displayDetails(){
        System.out.println("Movie details:");
        System.out.println("Title: " + this.title);
        System.out.println("Genre: " + this.genre);
        System.out.println("Rating: " + this.rating + "/10");
        System.out.println("-------------");
    }
}

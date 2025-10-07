package org.example.Lecture5.Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Your number is: " + getValidIntegerInput());
    }
    public static int getValidIntegerInput(){
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Please enter integer: ");
            try {
                userInput = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException exceptionMessage) {
                System.out.println("Invalid input. Please enter a valid integer");
                scanner.next();
            }
        }
        return userInput;
    }
}

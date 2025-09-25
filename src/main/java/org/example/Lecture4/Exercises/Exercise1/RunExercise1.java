package org.example.Lecture4.Exercises.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunExercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password and hit Enter button!");
        String password = scanner.nextLine();

        PasswordHealthChecker userPassword = new PasswordHealthChecker(password);
        ArrayList<Boolean> strengthConditions = new ArrayList<Boolean>();
        strengthConditions.add(userPassword.hasDigit());
        strengthConditions.add(userPassword.hasLower());
        strengthConditions.add(userPassword.hasSpecial());
        strengthConditions.add(userPassword.hasUpper());
        strengthConditions.add(userPassword.isBiggerThan8());

        int strength = 0;
        for(boolean condition : strengthConditions){
            if (condition){
                strength += 1;
            }
        }

        if (strength <= 2){
            System.out.println("Your password is: Weak");
        }
        else if (strength == 3) {
            System.out.println("Your password is: Medium");
        }
        else {
            System.out.println("Your password is: Strong");
        }
    }
}

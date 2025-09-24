package org.example.Lecture3.Exercises.Exercise2;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Double> grades;

    public Student(String name, ArrayList<Double> grades){
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage(){
        double sum = 0.0;
        for (double grade : this.grades){
            sum += grade;
        }

        return sum/ grades.size();
    }

    public void displayStudentInfo(){
        System.out.println("Student Info is:");
        System.out.println("Student name: " + this.name);
        System.out.println("Average grade: " + calculateAverage());
        System.out.println();
    }
}

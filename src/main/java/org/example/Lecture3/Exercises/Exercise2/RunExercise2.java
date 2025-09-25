package org.example.Lecture3.Exercises.Exercise2;

import java.util.ArrayList;

public class RunExercise2 {
    public static void main(String[] args) {
        ArrayList<Double> gradesStudent1 = new ArrayList<>();
        gradesStudent1.add(5.50);
        gradesStudent1.add(3.50);
        gradesStudent1.add(5.0);
        gradesStudent1.add(6.0);
        gradesStudent1.add(6.0);
        gradesStudent1.add(2.0);

        ArrayList<Double> gradesStudent2 = new ArrayList<>();
        gradesStudent2.add(5.50);
        gradesStudent2.add(3.50);
        gradesStudent2.add(5.0);
        gradesStudent2.add(6.0);
        gradesStudent2.add(2.0);

        ArrayList<Double> gradesStudent3 = new ArrayList<>();
        gradesStudent3.add(5.50);
        gradesStudent3.add(5.0);
        gradesStudent3.add(6.0);
        gradesStudent3.add(6.0);
        gradesStudent3.add(2.0);

        Student student1 = new Student("Alice", gradesStudent1);
        Student student2 = new Student("Bob", gradesStudent2);
        Student student3 = new Student("Charlie", gradesStudent3);

        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();
    }
}

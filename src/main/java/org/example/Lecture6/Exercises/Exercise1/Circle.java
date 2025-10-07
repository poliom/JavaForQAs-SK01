package org.example.Lecture6.Exercises.Exercise1;

public class Circle extends Shape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        System.out.println("Circle calculate");
        return Math.PI * radius * radius;
    }
}

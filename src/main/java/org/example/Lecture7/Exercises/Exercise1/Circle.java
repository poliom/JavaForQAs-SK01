package org.example.Lecture7.Exercises.Exercise1;

public class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*this.radius*this.radius);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*this.radius);
    }
}

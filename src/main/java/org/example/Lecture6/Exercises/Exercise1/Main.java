package org.example.Lecture6.Exercises.Exercise1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.displayArea();
        Shape circle = new Circle(-1);
        circle.displayArea();
        Shape rectangle = new Rectangle(2,-1);
        rectangle.displayArea();

    }
}

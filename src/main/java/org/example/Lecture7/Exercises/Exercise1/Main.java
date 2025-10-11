package org.example.Lecture7.Exercises.Exercise1;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        Rectangle myRectangle = new Rectangle(1,2);

        System.out.println("The area of myCircle is: " + myCircle.getArea());
        System.out.println("The perimeter of myCircle is: " + myCircle.getPerimeter());

        System.out.println("The area of myRectangle is: " + myRectangle.getArea());
        System.out.println("The perimeter of myRectangle is: " + myRectangle.getPerimeter());
    }
}

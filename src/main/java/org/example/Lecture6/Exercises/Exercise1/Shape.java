package org.example.Lecture6.Exercises.Exercise1;

public class Shape {
    public double calculateArea(){
        System.out.println("Shape calculate area");
        return 0;
    }

    public void displayArea(){
        double area = calculateArea();
        if (area<= 0){
            System.out.println("The shape is not define");
        }
        else {
            System.out.println("The area is: " + area);
        }
    }
}

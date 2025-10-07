package org.example.Lecture6.Demo.Polymorphism;

public class Bus extends Vehicle{
    public Bus(String brand, int maxSpeed, int price, int numberOfSeats){
        super(brand, maxSpeed, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int numberOfSeats;

    @Override
    public boolean stopEngine(){
        System.out.println("Can`t stop engine due to it is already stopped");
        return false;
    }

    public void numberOfSeats(){
        System.out.println("The bus has " + this.numberOfSeats + " number of seats");
    }

    @Override
    public void printInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
        System.out.println("Is engine started: " + this.isEngineStarted);
        System.out.println("Number of seats: " + this.numberOfSeats);
    }
}

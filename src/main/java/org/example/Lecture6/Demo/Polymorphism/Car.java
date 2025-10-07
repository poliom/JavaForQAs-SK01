package org.example.Lecture6.Demo.Polymorphism;

public class Car extends Vehicle{
    public Car(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType){
        super(brand, maxSpeed, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public int numberOfDoors;
    public String fuelType;

    public void playMusic(){
        System.out.println("Start radio");
    }

    public void stopMusic(){
        System.out.println("Stop radio");
    }

    public void engineStatus(){
        if (super.isEngineStarted){
            System.out.println("Engine is started");
        }
        else {
            System.out.println("Engine is stopped");
        }
    }

    public void stopEngineOnTrafficLight(){
        super.stopEngine();
    }

    @Override
    public boolean stopEngine(){
        this.playMusic();
        return false;
    }

    @Override
    public void printInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
        System.out.println("Is engine started: " + this.isEngineStarted);
        System.out.println("Number of doors: " + this.numberOfDoors);
        System.out.println("Fuel type: " + this.fuelType);
    }
}

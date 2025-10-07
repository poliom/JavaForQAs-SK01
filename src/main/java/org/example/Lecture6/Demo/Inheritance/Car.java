package org.example.Lecture6.Demo.Inheritance;

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
}

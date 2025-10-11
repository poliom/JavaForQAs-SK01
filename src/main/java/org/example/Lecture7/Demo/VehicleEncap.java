package org.example.Lecture7.Demo;

public abstract class VehicleEncap extends Parts {
    public VehicleEncap(String brand, int maxSpeed, int price){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String brand;
    public int maxSpeed;
    private int price;
    private boolean isCarEngineStarted = false;

    public boolean startEngine(){
        System.out.println("Start Vehicle Engine");
        //this.isEngineStarted = true;
        return true;
    }

    public boolean stopEngine(){
        System.out.println("Stop Vehicle Engine");
        this.isCarEngineStarted = false;
        return false;
    }

    public void printInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Max Speed: " + this.maxSpeed);
        System.out.println("Price: " + this.price);
        System.out.println("Is engine started: " + this.isCarEngineStarted);
    }

    public boolean getIsCarEngineStarted(){
        return this.isCarEngineStarted;
    }

    public void setIsCarEngineStarted(boolean isCarEngineStarted){
        this.isCarEngineStarted = isCarEngineStarted;
    }
    public int getPrice(){
        return this.price;
    }

    public String engineHead() {
        return "testCar";
    }
}

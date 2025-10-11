package org.example.Lecture6.Exercises.Exercise2;

public class Appliances {
    String brand;
    int powerConsumption;
    boolean isOn;

    public  Appliances(String brand, int powerConsumption){
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println(this.brand + " appliance is now on.");
    }

    public void turnOff(){
        this.isOn = false;
        System.out.println(this.brand + " appliance is now off.");
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Power Consumption: " + powerConsumption + "W");
        System.out.println("Status: "+ (isOn ? "ON" : "OFF"));
    }
}

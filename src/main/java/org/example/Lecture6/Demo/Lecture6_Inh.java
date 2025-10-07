package org.example.Lecture6.Demo;

import org.example.Lecture6.Demo.Inheritance.Car;
import org.example.Lecture6.Demo.Inheritance.Vehicle;

public class Lecture6_Inh {
    public static void main(String[] args) {
        Car audi = new Car("Audi", 180,5000,5,"Gasoline");
        System.out.println("Audi fuel type is: " + audi.fuelType);
        audi.playMusic();
        audi.startEngine();
        audi.fuelType = "Gasoline or LGP";
        System.out.println("Audi fuel type is: " + audi.fuelType);

        Car bmw = new Car("BWM", 150, 3000, 3, "Diesel");
        bmw.isEngineStarted = bmw.startEngine();
        bmw.stopMusic();
        System.out.println("The fuel type of Audi is: " + audi.fuelType);
        System.out.println("The fuel type of BMW is: " + bmw.fuelType);
        System.out.println("The price of Audi is: " + audi.price);
        System.out.println("The price of BMW is: " + bmw.price);
        System.out.println("The Engine of Audi is started: " + audi.isEngineStarted);
        System.out.println("The Engine of BMW is started: " + bmw.isEngineStarted);

        System.out.println("TrafficLight");
        //System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.engineStatus();
        System.out.println("Traffic light is red");
        System.out.println("Car stopped on red");
        bmw.stopEngineOnTrafficLight();
        //System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.engineStatus();
        System.out.println("Traffic light is yellow");
        bmw.isEngineStarted = bmw.startEngine();
        System.out.println("Traffic light is green");
        //System.out.println("Is BMW engine started: " + bmw.isEngineStarted);
        bmw.engineStatus();

        Vehicle baseCar = new Vehicle("Lada", 120, 1500);
        baseCar.isEngineStarted = baseCar.startEngine();
        baseCar.price = 20000;
        System.out.println("Is base car engine started: " + baseCar.isEngineStarted);
        System.out.println("Price of Lada is: " + baseCar.price);
    }
}

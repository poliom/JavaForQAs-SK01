package org.example.Lecture7.Demo;

import org.example.Lecture7.Demo.CarEncap;

public class Main {
    public static void main(String[] args) {
        CarEncap bmw = new CarEncap("BMW", 150, 2500,5, "Diesel");

        System.out.println("Print is engine started: " + bmw.getIsCarEngineStarted());
        bmw.setIsCarEngineStarted(true);
        System.out.println("Print is engine started: " + bmw.getIsCarEngineStarted());
        System.out.println("Get price: " + bmw.getPrice());
        bmw.typeOfBody();
        System.out.println(bmw.engineHead());

        System.out.println("Radio is: " + bmw.getRadioStatus());
        bmw.turnOnRadio();
        System.out.println("Radio is: " + bmw.getRadioStatus());
        bmw.turnOffRadio();
        System.out.println("Radio is: " + bmw.getRadioStatus());
        bmw.numberOfSeats();
        bmw.showSpeed();
        bmw.showWaterTemperature();
    }
}

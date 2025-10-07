package org.example.Lecture6.Demo;

import org.example.Lecture6.Demo.Polymorphism.Bus;
import org.example.Lecture6.Demo.Polymorphism.Car;
import org.example.Lecture6.Demo.Polymorphism.Vehicle;

public class Lecture6_Poly {
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

        Bus myBus = new Bus("WV", 100, 3600, 10);
        System.out.println("My bus brand is: " + myBus.brand);
        myBus.numberOfSeats();
        System.out.println("Is my bus engine started: " + myBus.isEngineStarted);
        System.out.println("My bus engine status: " + myBus.stopEngine());

        Vehicle tesla = new Car("Tesla", 190,100000,5,"Electric");
        Vehicle partner = new Bus("Pejo",140,25000,7);
        Vehicle testCar = new Vehicle("Asus", 250, 152);

        System.out.println("Tesla info: ");
//        System.out.println("Brand: " + tesla.brand);
//        System.out.println("MaxSpeed: " + tesla.maxSpeed);
//        System.out.println("Price: " + tesla.price);
        tesla.printInfo();
        System.out.println("Partner info: ");
        partner.printInfo();
        System.out.println("Test car info: ");
        testCar.printInfo();
    }
}

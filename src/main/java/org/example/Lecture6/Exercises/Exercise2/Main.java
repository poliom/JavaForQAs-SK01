package org.example.Lecture6.Exercises.Exercise2;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG", 1500, 7);
        Refrigerator refrigerator = new Refrigerator("Samsung", 200);

        washingMachine.displayInfo();
        washingMachine.startWashCycle();
        washingMachine.turnOn();
        washingMachine.displayInfo();
        washingMachine.startWashCycle();

        refrigerator.displayInfo();
        refrigerator.setTemperature(3);
        refrigerator.displayInfo();
    }
}

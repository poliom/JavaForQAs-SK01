package org.example.Lecture6.Exercises.Exercise2;

public class WashingMachine extends Appliances {
    int loadCapacity;
    public WashingMachine(String brand, int powerConsumption, int loadCapacity){
        super(brand,powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startWashCycle(){
        if (super.isOn){
            System.out.println("Starting wash cycle with load capacity: " + loadCapacity + " kg.");
        }
        else {
            System.out.println("Cannot start wash cycle. The machine is OFF.");
        }
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Load capacity: " + loadCapacity + " kg.");
    }
}

package org.example.Lecture7.Demo;

public class CarEncap extends VehicleEncap implements CarInterior{
    public CarEncap(String brand, int maxSpeed, int price, int numberOfDoors, String fuelType){
        super(brand, maxSpeed, price);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    public int numberOfDoors;
    public String fuelType;
    private boolean isRadioTurnOn = false;

    public void playMusic(){
        System.out.println("Start radio");
    }

    public void stopMusic(){
        System.out.println("Stop radio");
    }

    public void engineStatus(){
        if (super.getIsCarEngineStarted()){
            System.out.println("Engine is started");
        }
        else {
            System.out.println("Engine is stopped");
        }
    }

    public void stopEngineOnTrafficLight(){
        super.stopEngine();
    }

    public void typeOfBody(){
        System.out.println("Car Body");
    }


    @Override
    public void numberOfSeats() {
        System.out.println("Number of seats are 10");
    }

    @Override
    public void showSpeed() {
        System.out.println("Current speed is: 120");
    }

    @Override
    public void showWaterTemperature() {
        System.out.println("Water temperature is: 90C");
    }

    @Override
    public void turnOnRadio() {
        this.isRadioTurnOn = true;
        System.out.println("Radio is turned on");
    }

    public void turnOffRadio(){
        this.isRadioTurnOn = false;
        System.out.println("Radio is turned off");
    }

    public String getRadioStatus(){
        return (this.isRadioTurnOn ? "ON" : "OFF");
    }
}

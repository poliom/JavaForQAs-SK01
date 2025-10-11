package org.example.Lecture6.Exercises.Exercise2;

public class Refrigerator extends Appliances{
    int temperature;

    public Refrigerator(String brand, int powerConsumption){
        super(brand,powerConsumption);
        this.temperature = 0;
    }

    public void setTemperature(int temperature){
        if (temperature >= -3 && temperature <= 5){
            this.temperature = temperature;
        }
        else{
            this.temperature = 0;
        }
        System.out.println("Temperature is set to: " + this.temperature + "C");
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature is: " + this.temperature + "C");
    }
}

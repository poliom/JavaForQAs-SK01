package org.example.Lecture8;

public class Bulgarian extends Person{
    public Bulgarian(String name,
                    String sex,
                    String religion,
                    String languageSpoken,
                    String job,
                    String nationality,
                    String EGN,
                    String countryOfResidence){
        super(name,
                sex,
                religion,
                languageSpoken,
                job,
                nationality,
                EGN,
                countryOfResidence);}
    @Override
    public void sayHello(){
        System.out.println("Hello");
    }

    public void drinkRakia(){
        System.out.println(super.getName() + " is drinking Rakia");
    }
}

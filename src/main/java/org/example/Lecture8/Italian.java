package org.example.Lecture8;

public class Italian extends Person{
    public Italian(String name,
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

    public void eatPasta(){
        System.out.println(super.getName() + " is eating Pasta");
    }
}

package org.example.Lecture8;

public class American extends Person{
    public American(String name,
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

    public void celebrateThanksGiving(){
        System.out.println(super.getName() + " is celebrating Thanks Giving");
    }
}

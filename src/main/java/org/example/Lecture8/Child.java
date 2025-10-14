package org.example.Lecture8;

public class Child extends Person{
    public Child(String name,
                 String sex,
                 String religion,
                 String languageSpoken,
                 String nationality,
                 String EGN,
                 String countryOfResidence){
        super(name,
              sex,
              religion,
              languageSpoken,
              "",
              nationality,
              EGN,
              countryOfResidence);
    }
    @Override
    public void isAdult(){
        System.out.println(super.getName() + " is NOT adult");
    }

    @Override
    public boolean canTakeLoan(){
        return false;
    }

    @Override
    public void setJob(String job){
        System.out.println("Child can NOT work");
    }

    @Override
    public String getJob(){
        return "Children can NOT work";
    }

    public void play(){
        System.out.println("Kids are playing with toys");
    }
}

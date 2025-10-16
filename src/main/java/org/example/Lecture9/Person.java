package org.example.Lecture9;

import java.util.regex.Pattern;

public class Person {
    private static final Pattern TEN_DIGITS = Pattern.compile("^\\d{10}$");
    private final String name;
    private final String nationalId;

    public Person(String name, String nationalId){
        stringPersonVerification(name, "name");
        this.name = name;
        stringPersonVerification(nationalId, "national Id");
        this.nationalId = nationalId;
    }

    private void stringPersonVerification(String personString, String property){
        if(personString == null || personString.isBlank() || personString.isEmpty()){
            throw new IllegalArgumentException("Data provided for " + property + " is not valid. Here is the data: " + personString);
        }
        if (property.equals("national Id")){
            if (!TEN_DIGITS.matcher(personString).matches()){
              throw new IllegalArgumentException(property + " is not matching the 10 digit requerment. Here is entered data: " + personString);
            }
        }
    }

    public String getName(){
        return this.name;
    }

    public String getNationalId(){
        return this.nationalId;
    }
}

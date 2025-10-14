package org.example.Lecture8;

public class Person {
    public Person(
            String name,
            String sex,
            String religion,
            String languageSpoken,
            String job,
            String nationality,
            String EGN,
            String countryOfResidence){
        validateEGN(EGN);
        this.EGN = EGN;
        this.name = name;
        validateSex(sex);
        this.sex = sex;
        this.religion = religion;
        this.languageSpoken = languageSpoken;
        this.job = job;
        this.nationality = nationality;
        this.countryOfResidence = countryOfResidence;
        this.dateOfBirth = getDateOfBirth(EGN);
        this.age = getAge(EGN);
    }

    private final String name;
    private final String sex;
    private final String religion;
    private final String languageSpoken;
    private String job;
    private final String nationality;
    private final String EGN;
    private final String dateOfBirth;
    private final int age;
    private String countryOfResidence;

    private void validateEGN(String EGN){
        if (EGN == null || EGN.length() != 10){
            throw new IllegalArgumentException("Number of digits in EGN is 10!");
        }
        boolean areDigits = true;
        for (int i = 0; i<EGN.length(); i++){
            String symbol = EGN.substring(i,i+1);
            try {
                int number = Integer.parseInt(symbol);
            }catch(NumberFormatException exception){
                areDigits = false;
                break;
            }
        }
        if (!areDigits){
            throw new IllegalArgumentException("Entered EGN is not only with digits, here is the entered EGN: " + EGN);
        }
    }

    private String getDateOfBirth(String EGN){
        String year = EGN.substring(0,2);
        String month = EGN.substring(3,4);
        String day = EGN.substring(5,6);
        return "19" + year + "." + month + "." + day;
    }

    private int getAge(String EGN){
        String year = "19" + EGN.substring(0,2);
        int ageEGN = Integer.parseInt(year);
        int currentYear = 2025;
        return currentYear - ageEGN;
    }

    private void validateSex(String sex){
        if (!("male".equalsIgnoreCase(sex) || "female".equalsIgnoreCase(sex))){
            System.out.println("The sex is wrong, please use only 'male' or 'female', your entry is: " + sex);
            System.out.println("System continues");

        }
    }

    public void sayHello(){
        switch (this.languageSpoken.toLowerCase()){
            case "bulgarian":
                System.out.println("Здравей");
                break;
            case "italian":
                System.out.println("Buongiorno");
                break;
            case "english":
            default:
                System.out.println("Hello");
        }
    }
    public void celebrateEaster(){
//        if (this.religion.equalsIgnoreCase("Orthodox") || religion.equalsIgnoreCase("Catholic")){
//            System.out.println(this.name + " is celebrating Easter");
//        }
//        else {
//            System.out.println(this.name + " is NOT celebrating Easter");
//        }
        switch (this.religion.toLowerCase()){
            case "catholic":
            case "orthodox":
                System.out.println(this.name + " is celebrating Easter");
                break;
            default:
                System.out.println(this.name + " is NOT celebrating Easter");
        }
    }

    public void isAdult(){
        switch (this.countryOfResidence.toLowerCase()){
            case "bulgaria":
            case "italy":
                printAdult(18);
                break;
            case "usa":
                printAdult(21);
                break;
            default:
                System.out.println("We don`t know if " + this.name + " is adult in: " + this.countryOfResidence);
        }
    }

    private void printAdult(int age) {
        if (this.age >= age){
            System.out.println(this.name + " is adult");
        }
        else {
            System.out.println(this.name + " is NOT adult");
        }
    }

    public boolean canTakeLoan(){
        return job != null && !job.isEmpty();
    }

    public void setCountryOfResidence(String countryOfResidence){
        this.countryOfResidence = countryOfResidence;
    }
    public void setJob(String job){
        this.job = job;
    }

    public String getName(){
        return this.name;
    }

    public String getSex(){
        return this.sex;
    }

    public String getReligion(){
        return this.religion;
    }

    public String getLanguageSpoken(){
        return this.languageSpoken;
    }

    public String getJob(){
        return this.job;
    }

    public String getNationality(){
        return this.nationality;
    }

    public String getEGN(){
        return this.EGN;
    }

    public String getDateOfBirth(){
        return this.dateOfBirth;
    }

    public int getAge(){
        return this.age;
    }

    public String getCountryOfResidence(){
        return this.countryOfResidence;
    }

    public void printPersonInfo(){
        celebrateEaster();
        sayHello();
        isAdult();
        System.out.println("Can person take a loan: " + canTakeLoan());
        System.out.println("Person name is: " + getName());
        System.out.println("Person sex is: " + getSex());
        System.out.println("Person religion is: " + getReligion());
        System.out.println("Person language spoken is: " + getLanguageSpoken());
        System.out.println("Person job is: " + getJob());
        System.out.println("Person nationality is: " + getNationality());
        System.out.println("Person EGN is: " + getEGN());
        System.out.println("Person date of birth is: " + getDateOfBirth());
        System.out.println("Person age is: " + getAge());
        System.out.println("Person country of residence is: " + getCountryOfResidence());
    }
}

package org.example.Lecture8;

public class DemoPerson {
    public static void main(String[] args) {
        Person bulgarian = new Person("Ivan", "male", "Orthodox", "Bulgarian", "", "bulgarian", "7401051859", "germany");
        Bulgarian bulgarianPerson = new Bulgarian("Yoana", "female", "Orthodox", "Bulgarian", "Developer", "bulgarian", "7401051859", "bulgaria");
        Person italian = new Person("Djovany", "male", "Catholic", "Italian", "Driver", "italian", "8401051859", "italy");
        Italian italianPerson = new Italian("Amalia", "female", "Catholic", "Italian", "Influencer", "italian", "9401051859", "italy");
        Person american = new Person("Donald", "male", "Orthodox", "American", "President", "bulgarian", "5401051859", "usa");
        American americanPerson = new American("Makal", "male", "Catholic", "American", "Quality Assurance", "spanish", "3401051859", "usa");
        Child child = new Child("Marko", "male", "Orthodox", "Russian", "bulgarian", "9901051859", "England");

        System.out.println("---Bulgarian information---");
        bulgarian.printPersonInfo();
        bulgarian.setJob("Technician");
        System.out.println("Bulgarian person job is: " + bulgarian.getJob());
        bulgarian.setCountryOfResidence("Norway");
        System.out.println("Bulgarian person country of residence is: " + bulgarian.getCountryOfResidence());
        System.out.println("---Italian information---");
        italian.printPersonInfo();
        italian.setJob("Taxi Driver");
        System.out.println("Italian person job is: " + italian.getJob());
        italian.setCountryOfResidence("Bulgaria");
        System.out.println("Italian person country of residence is: " + italian.getCountryOfResidence());
        System.out.println("---American information---");
        american.printPersonInfo();
        System.out.println("---Child information---");
        child.printPersonInfo();
        child.setJob("QA");
        child.play();
        System.out.println("---AmericanPerson information---");
        americanPerson.printPersonInfo();
        americanPerson.celebrateThanksGiving();
        System.out.println("---BulgarianPerson information---");
        bulgarianPerson.celebrateEaster();
        bulgarianPerson.sayHello();
        bulgarianPerson.isAdult();
        bulgarianPerson.printPersonInfo();
        bulgarianPerson.drinkRakia();
        System.out.println("---ItalianPerson information---");
        italianPerson.printPersonInfo();
        italianPerson.eatPasta();
    }
}
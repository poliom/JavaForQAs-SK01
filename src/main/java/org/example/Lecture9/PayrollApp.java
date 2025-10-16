package org.example.Lecture9;

public class PayrollApp {
    public static void main(String[] args) {
        PayrollRegistry registry = new PayrollRegistry();

        Employee misho = new FullTimeEmployee(
                "Misho Mishov",
                "9803256894",
                "E-1001",
                "Workstation Number: 01",
                4200
        );

        Employee deni = new FullTimeEmployee(
                "Denislava Simeonova",
                "9912256894",
                "E-1002",
                "Workstation Number: 02",
                7200
        );

        Employee grisho = new PartTimeEmployee(
                "Grisho Grishov",
                "7412189643",
                "E-2001",
                0.0,
                80.5,
                36.75
        );

        Employee bibi = new PartTimeEmployee(
                "Bilyana Mihova",
                "8412159643",
                "E-2002",
                0.0,
                100,
                36.75
        );

        System.out.println("Current number of employees is: " + registry.employeesSize());
        registry.addEmployee(misho);
        System.out.println("Current number of employees is: " + registry.employeesSize());
        registry.addEmployee(grisho);
        System.out.println("Current number of employees is: " + registry.employeesSize());
        registry.addEmployee(bibi);
        System.out.println("Current number of employees is: " + registry.employeesSize());
        registry.addEmployee(deni);
        System.out.println("Current number of employees is: " + registry.employeesSize());

        registry.summaryReport();

        System.out.println("Full time employees work stations:");
        System.out.println(misho.getName() + " sits on " + misho.getDedicatedWorkStation());
        System.out.println(deni.getName() + " sits on " + deni.getDedicatedWorkStation());
        System.out.println(grisho.getName() + " sits on " + grisho.getDedicatedWorkStation());
        System.out.println(bibi.getName() + " sits on " + bibi.getDedicatedWorkStation());
    }
}

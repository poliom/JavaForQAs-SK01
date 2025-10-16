package org.example.Lecture9;

public class PartTimeEmployee extends Employee{
    private final double hoursWorked;
    private final double hourlyRate;

    public PartTimeEmployee(
            String name,
            String nationalId,
            String employeeId,
            double baseSalary,
            double hoursWorked,
            double hourlyRate){
        super(name,nationalId,employeeId,baseSalary);
        partTimeEmployeeValidationProperty(hoursWorked, "Hours worked");
        this.hoursWorked = hoursWorked;
        partTimeEmployeeValidationProperty(hourlyRate, "Hourly rate");
        this.hourlyRate = hourlyRate;
    }

    private void partTimeEmployeeValidationProperty(double employeeString, String property){
        if (employeeString < 0){
            throw new IllegalArgumentException(property + " cannot be negative");
        }
    }

    public double getHoursWorked(){
        return this.hoursWorked;
    }

    public double getHourlyRate(){ return this.hourlyRate;}

    @Override
    public double monthlySalary(){
        return getHourlyRate() * getHoursWorked();
    }

    @Override
    public String getDedicatedWorkStation(){
        return "Workstation Number: 03-shared";
    }
}

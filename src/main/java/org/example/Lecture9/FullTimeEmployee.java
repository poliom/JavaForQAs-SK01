package org.example.Lecture9;

public class FullTimeEmployee extends Employee{
    private final String dedicatedWorkStation;
    public FullTimeEmployee(
            String name,
            String nationalId,
            String employeeId,
            String dedicatedWorkStation,
            double baseSalary){
        super(name,nationalId,employeeId,baseSalary);
        this.dedicatedWorkStation = dedicatedWorkStation;
    }

    @Override
    public  double monthlySalary(){
        return super.getBaseSalary();
    }

    @Override
    public String getDedicatedWorkStation(){
        return this.dedicatedWorkStation;
    }
}

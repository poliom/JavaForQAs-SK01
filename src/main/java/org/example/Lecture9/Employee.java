package org.example.Lecture9;

abstract class Employee extends Person implements Payable{

    private final String employeeId;
    private final double baseSalary;

    public Employee(
            String name,
            String nationalId,
            String employeeId,
            double baseSalary){
        super(name,nationalId);
        if(employeeId == null || employeeId.isBlank() || employeeId.isEmpty()){
            throw new IllegalArgumentException("Data provided for Employee Id is not valid. Here is the data: " + employeeId);
        }
        this.employeeId = employeeId;
        if (baseSalary < 0){
            throw new IllegalArgumentException("Base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId(){
        return this.employeeId;
    }

    protected double getBaseSalary(){
        return this.baseSalary;
    }

    public String getDedicatedWorkStation(){
        return "Only full time employees have work stations";
    }
}

package org.example.Lecture9;

import java.util.HashMap;

public class PayrollRegistry {
    private final HashMap<String, Employee> employees = new HashMap<>();

    public void addEmployee(Employee employee){
        if (employee == null){
            throw new IllegalArgumentException("Employee cannot be null.");
        }
        String employeeId = employee.getEmployeeId();
        if (employees.containsKey(employeeId)){
            throw new IllegalArgumentException("Employee with Id: " + employeeId + " is already exists.");
        }
        employees.put(employeeId, employee);
    }

    public double totalMonthlySalaries(){
        double sum = 0.0;
        for (Employee employee : employees.values()){
            sum += employee.monthlySalary();
        }
        return sum;
    }

    public double averageMonthlySalaries(){
        if (employees.isEmpty()){
            return 0.0;
        }
        return totalMonthlySalaries() / employeesSize();
    }

    public int employeesSize(){
        return this.employees.size();
    }

    public void summaryReport(){
        System.out.println("Employees are: " + employeesSize());
        System.out.println("Total monthly salaries: " + totalMonthlySalaries());
        System.out.println("Average monthly salary: " + averageMonthlySalaries());
    }
}

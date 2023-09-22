package org.example;

import org.example.enums.EmployeeType;
import org.example.model.Employee;
import org.example.model.Lead;
import org.example.model.OfficeWorker;
import org.example.model.Sale;

import java.util.Arrays;
import java.util.List;

public class OfficeWorkplace {
    private List<Employee> employees;

    public OfficeWorkplace() {
        this.employees = Arrays.asList(
                new Sale("John1", "Sales1"),
                new Sale("John2", "Sales1"),
                new Sale("John3", "Sales1"),
                new OfficeWorker("Jim1", "Office1", EmployeeType.JUNIOR),
                new OfficeWorker("Jim2", "Office1", EmployeeType.JUNIOR),
                new OfficeWorker("Jim3", "Office1", EmployeeType.SENIOR),
                new Lead("Tom1", "Office1", 3),
                new Lead("Tom2", "Sales1", 3)
        );
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void calculateYearlySalaries() {
        employees.forEach(employee -> System.out.println(employee + " has yearly salary: " + employee.yearlySalary()));
    }
}
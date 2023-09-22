package org.example.model;

import org.example.enums.EmployeeType;

public class OfficeWorker extends Employee {
    private EmployeeType employeeType;

    public OfficeWorker(String name, String groupName, EmployeeType employeeType) {
        super(name, groupName);
        this.employeeType = employeeType;
    }

    @Override
    public double monthlySalary() {
        return employeeType.equals(EmployeeType.JUNIOR) ? 1250 : 1700;
    }
}
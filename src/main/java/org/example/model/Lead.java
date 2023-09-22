package org.example.model;

import java.util.List;

public class Lead extends Employee {
    private final double baseSalary = 1800;
    private int numberOfEmployees;

    public Lead(String name, String groupName, int numberOfEmployees) {
        super(name, groupName);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double monthlySalary() {
        return baseSalary + (200 * numberOfEmployees);
    }
}
package org.example.model;

import java.util.Random;

public class Sale extends Employee {
    public Sale(String name, String groupName) {
        super(name, groupName);
    }

    @Override
    public double monthlySalary() {
        return new Random().nextInt(500) + 1500;
    }
}
package com.dheepak.learning.java.random.pojos.comparators;

import com.dheepak.learning.java.random.pojos.Employee;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

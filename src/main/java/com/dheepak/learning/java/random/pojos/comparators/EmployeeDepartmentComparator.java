package com.dheepak.learning.java.random.pojos.comparators;

import com.dheepak.learning.java.random.pojos.Employee;

import java.util.Comparator;

public class EmployeeDepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getDepartment().compareTo(o2.getDepartment());
    }
}

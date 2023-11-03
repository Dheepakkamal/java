package com.dheepak.learning.java.random.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable{
    private Integer id;
    private String name;
    private Double salary;
    private String department;
    private Double experience;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary) && Objects.equals(department, employee.department) && Objects.equals(experience, employee.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, department, experience);
    }

    @Override
    public int compareTo(Object o) {
        Employee employee = (Employee) o;
        return this.getId().compareTo(employee.getId());
    }
}

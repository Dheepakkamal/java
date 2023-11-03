package com.dheepak.learning.java.random;

import com.dheepak.learning.java.random.pojos.Employee;
import com.dheepak.learning.java.random.pojos.comparators.EmployeeDepartmentComparator;
import com.dheepak.learning.java.random.pojos.comparators.EmployeeSalaryComparator;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsMain {

    public static List<Employee> getEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(3, "Prakash", 125000.0, "CS", 5.5));
        employeeList.add(new Employee(2, "Kamal", 90000.0, "IT", 3.5));
        employeeList.add(new Employee(1, "Dheepak", 7000000.0, "IT", 1.5));
        employeeList.add(new Employee(4, "Tamil", 215000.0, "CS", 3.5));
        return employeeList;
    }
    public static void main(String[] args) {
        var employees = getEmployees();
        System.out.println(employees);
        Collections.sort(employees, Comparator.comparing(Employee::getName));
        System.out.println(employees);

        Map<String, Optional<Employee>> departmentHighSalaryEmployeeMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                       Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(departmentHighSalaryEmployeeMap);

        var highSalaryMap = employees.stream()
                .collect(Collectors.toMap(Employee::getDepartment, Function.identity(), BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println(highSalaryMap);
    }
}

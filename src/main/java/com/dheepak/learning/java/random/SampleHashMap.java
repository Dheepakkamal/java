package com.dheepak.learning.java.random;



import com.dheepak.learning.java.random.pojos.Employee;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {

    public static Map<Employee, Employee> getEmployeeSalaryMapData() {
        Map<Employee, Employee> employeeMap = new HashMap<>();
        employeeMap.put(new Employee(2, "kamal", null, null, null), new Employee(2, "kamal", null, null, null));
        return employeeMap;

    }
    public static void main(String[] args) {
        Map<Employee, Employee> employeeSalaryMap = new HashMap<>();
        Employee employee = new Employee(1, "dheepak", null, null, null);
        employeeSalaryMap.put(employee, employee);
        employee.setName("kamal");
        employeeSalaryMap.put(employee, employee);
        employeeSalaryMap.put(new Employee(1, "dheepak", null, null, null), employee);
        System.out.println(employeeSalaryMap);

    }
}

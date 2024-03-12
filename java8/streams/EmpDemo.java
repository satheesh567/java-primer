package com.revature.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmpDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", 450000.0));
        employees.add(new Employee(2, "Bob", 350000.0));
        employees.add(new Employee(3, "Charlie", 500000.0));
        employees.add(new Employee(4, "David", 420000.0));

        System.out.println("Employees with salary > 400000:");
        employees.stream()
                .filter(emp -> emp.getSalary() > 400000)
                .forEach(System.out::println);

        employees.forEach(emp -> emp.setSalary(emp.getSalary() * 1.25));

        System.out.println("\nDetails of all employees after 25% salary hike:");
        employees.forEach(System.out::println);

        List<Employee> empNames = employees.stream()
                .map(e->{String s=e.getName().toUpperCase();
                    e.setName(s);
                      return e;})
                .collect(Collectors.toList());
        System.out.println("\nNames of employees in uppercase:");
        empNames.forEach(System.out::println);
    }
}

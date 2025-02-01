package com.spring.play.swagger2.service;


import com.spring.play.swagger2.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage the employee details
 */
@Service
public class EmployeeService {

    private final List<Employee> emplyeeList = new ArrayList<>();

    /**
     * Constructor to add some default employees
     * to the list
     */
    public EmployeeService() {
        emplyeeList.add(new Employee(1, "John", "IT", 1000, 25));
        emplyeeList.add(new Employee(2, "Doe", "HR", 2000, 30));
        emplyeeList.add(new Employee(3, "Smith", "Finance", 3000,35));
        emplyeeList.add(new Employee(4, "Tom", "Admin", 4000,40));
        emplyeeList.add(new Employee(5, "Jerry", "IT", 5000,56));
        emplyeeList.add(new Employee(6, "Marry", "HR", 6000, 45));
        emplyeeList.add(new Employee(7, "Peter", "Finance", 7000, 50));
        emplyeeList.add(new Employee(8, "Harry", "Admin", 8000, 55));
    }


    /**
     * Method to get the list of employees
     *
     * @return List of employees
     */
    public List<?> getEmployeeDetails() {
        return emplyeeList;
    }

    /**
     * Method to add an employee to the list
     *
     * @param employee
     */
    public void addEmployee(Employee employee) {
        emplyeeList.add(employee);
    }

}

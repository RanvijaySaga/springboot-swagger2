package com.spring.play.swagger2.controller;

import com.spring.play.swagger2.dto.Employee;
import com.spring.play.swagger2.service.EmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class EmployeeControllerTest {

    private EmployeeController employeeController;
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
        employeeService = new EmployeeService();
        employeeController = new EmployeeController(employeeService);
    }

    //@Test
    void getEmployeeDetails() {
        employeeController.getEmployeeDetails();
        verify(employeeService).getEmployeeDetails();
        assert(!employeeService.getEmployeeDetails().isEmpty());
    }

    @Test
    void addEmployee() {
        Employee employee = new Employee(5, "Jerry", "IT", 5000);

    }
}
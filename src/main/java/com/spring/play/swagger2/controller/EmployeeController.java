package com.spring.play.swagger2.controller;


import com.spring.play.swagger2.dto.Employee;
import com.spring.play.swagger2.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(value = "Employee API", description = "Employee Management API")
@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

    @ApiOperation(value = "Get Employee", notes = "Get all employee details")
    @GetMapping("/getEmployeeDetails")
    public ResponseEntity<?> getEmployeeDetails() {
        return new ResponseEntity<>(employeeService.getEmployeeDetails(), HttpStatus.OK);
    }

    @ApiOperation(value = "Add Employee", notes = "Add new employees to the list")
    @PostMapping("/addEmployee")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return new ResponseEntity<>("Employee added successfully", HttpStatus.CREATED);
    }
}

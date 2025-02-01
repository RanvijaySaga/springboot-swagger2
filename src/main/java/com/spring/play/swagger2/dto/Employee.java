package com.spring.play.swagger2.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    private long id;

    @NotNull(message = "Name cannot be null")
    private String name;

    @NotNull(message = "department cannot be null")
    private String department;

    @Min(value = 1, message = "Salary cannot be less than 1")
    private int salary;

    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 60, message = "Age should not be greater than 60")
    private int age;

}

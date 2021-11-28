package com.farm.wagemanagement.model;


import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name= "Employee")
public class Employee {

    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private long mobileNumber;
    private String address;
}

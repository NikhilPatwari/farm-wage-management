package com.farm.wagemanagement.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Employee")
public class Employee {

    @Id
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String sex;
    private long mobileNumber;
    private String address;
}

package com.farm.wagemanagement.model;


import lombok.Builder;
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
    private String name;
    private int age;
    private String sex;
    private long mobileNumber;
    private String address;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "orgId",
            referencedColumnName = "id"
    )
    private Organization org;
    @Builder.Default
    private double balanceAmount = 0;
    private boolean status;
}

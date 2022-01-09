package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class task {
    @Id
    private long id;
    private String location;
    private long employeeId;
    private String name;
    private String produce;
    private String description;
    private String contractType;
    private double ratePerItem;
}

package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class expense {
    @Id
    private long id;
    private long expenseTypeId;
    private String expenseType;
    private String expenseDescription;
    private double cost;
    private double quantity;
    private long locationId;
    private String location;
    private long taskId;
    private long vehicleId;
    private String vehicleDescription;

}

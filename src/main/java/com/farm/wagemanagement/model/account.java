package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class account {
    @Id
    private long id;
    private long employeeId;
    private long workRecordId;
    private double amount;
}

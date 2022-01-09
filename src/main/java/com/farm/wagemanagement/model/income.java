package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@Entity
public class income {
    @Id
    private long id;
    private long paymentModeId;
    private double amount;
    private String paymentStatus;
    private LocalDate probableConfirmationDate;
    private String produce;
    private double quantity;
    private double rate;
    private long buyerId;

}

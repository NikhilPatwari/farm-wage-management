package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@Entity
public class workRecord {
    @Id
    private long id;
    private double payout;
    private LocalDate date;
}

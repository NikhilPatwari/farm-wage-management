package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@Entity
public class paymentMode {
    @Id
    private long id;
    private String paymentType;
    private LocalDate paymentDate;
    private long billId;
    private long bankAccountNo;
}

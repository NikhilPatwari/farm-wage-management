package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class PaymentMode {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paymentModeSequence")
    @SequenceGenerator(name = "paymentModeSequence", sequenceName = "paymentModeSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String type;
}

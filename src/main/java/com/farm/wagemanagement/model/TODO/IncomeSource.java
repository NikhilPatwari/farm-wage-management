package com.farm.wagemanagement.model.TODO;

import lombok.Data;

import javax.persistence.*;

@Entity
public class IncomeSource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incomeSourceSequence")
    @SequenceGenerator(name = "incomeSourceSequence", sequenceName = "incomeSourceSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @Data
    @Entity
    public static class PaymentMode {
        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paymentModeSequence")
        @SequenceGenerator(name = "paymentModeSequence", sequenceName = "paymentModeSequence", allocationSize = 1)
        @Column(name = "id", nullable = false)
        private Long id;
        private String type;
    }
}

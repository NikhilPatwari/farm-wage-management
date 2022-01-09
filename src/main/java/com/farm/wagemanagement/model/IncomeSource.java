package com.farm.wagemanagement.model;

import javax.persistence.*;

@Entity
public class IncomeSource {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "incomeSourceSequence")
    @SequenceGenerator(name = "incomeSourceSequence", sequenceName = "incomeSourceSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
}

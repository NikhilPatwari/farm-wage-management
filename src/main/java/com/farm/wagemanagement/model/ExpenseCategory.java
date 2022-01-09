package com.farm.wagemanagement.model;

import javax.persistence.*;

@Entity
public class ExpenseCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expenseSequence")
    @SequenceGenerator(name = "expenseSequence", sequenceName = "expenseSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
}

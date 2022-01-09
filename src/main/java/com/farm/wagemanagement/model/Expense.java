package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "expenseSequence")
    @SequenceGenerator(name = "expenseSequence", sequenceName = "expenseSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "expenseCategoryId",
            referencedColumnName = "id"
    )
    private ExpenseCategory expenseCategory;

    private String expenseDescription;
    private double cost;
    private double quantity;
    private LocalDateTime dateTime;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "locationId",
            referencedColumnName = "id"
    )
    private Location location;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "taskId",
            referencedColumnName = "id"
    )
    private Task task;

    @ManyToOne(
            cascade = CascadeType.ALL
    )@JoinColumn(
            name = "vehicleId",
            referencedColumnName = "id"

    )
    private Vehicle vehicle;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "orgId",
            referencedColumnName = "id"
    )
    private Organization org;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "farmerId",
            referencedColumnName = "id"
    )
    private Employer employer;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "employeeId",
            referencedColumnName = "id"
    )
    private Employee employee;
}

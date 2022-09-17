package com.farm.wagemanagement.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class PaymentHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payrollSequence")
    @SequenceGenerator(name = "payrollSequence", sequenceName = "payrollSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private LocalDateTime dateTime;
    private double amountPaid;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "employeeId",
            referencedColumnName = "id"
    )
    private Employee employee;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "employerId",
            referencedColumnName = "id"
    )
    private Employer employer;
}

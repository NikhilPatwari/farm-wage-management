package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class WorkRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workRecordSequence")
    @SequenceGenerator(name = "workRecordSequence", sequenceName = "workRecordSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    private double payout;
    private LocalDate date;
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
    )
    @JoinColumn(
            name = "empId",
            referencedColumnName = "id"
    )
    private Employee employee;
    private double totalWork;
    private double compensation;
}

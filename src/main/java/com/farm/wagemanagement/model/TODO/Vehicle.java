package com.farm.wagemanagement.model.TODO;

import javax.persistence.*;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicleSequence")
    @SequenceGenerator(name = "vehicleSequence", sequenceName = "vehicleSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
}

package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Task {
    @Id
    private long id;
    private String name;
    private String description;
    @Embedded
    private Contract contract;
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "locationId",
            referencedColumnName = "id"
    )
    private Location location;


}

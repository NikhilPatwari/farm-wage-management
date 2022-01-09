package com.farm.wagemanagement.model;

import javax.persistence.*;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "locationSequence")
    @SequenceGenerator(name = "locationSequence", sequenceName = "locationSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;
    private String name;
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false

    )
    @JoinColumn(
            name = "orgId",
            referencedColumnName = "id"
    )
    private Organization org;

}

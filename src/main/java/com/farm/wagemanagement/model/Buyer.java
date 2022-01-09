package com.farm.wagemanagement.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "buyerSequence")
    @SequenceGenerator(name = "buyerSequence", sequenceName = "buyerSequence", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;
    private String buyerName;
    private String buyerAddress;
    private String buyerContact;
}

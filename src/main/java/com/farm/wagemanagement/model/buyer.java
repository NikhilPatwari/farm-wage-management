package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class buyer {
    @Id
    private long id;
    private String buyerName;
    private String buyerAddress;
    private String buyerContact;
}

package com.farm.wagemanagement.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Data
@Entity
public class bill {
    @Id
    private long id;
    private LocalDate billDate;
    private String imagePath;
}

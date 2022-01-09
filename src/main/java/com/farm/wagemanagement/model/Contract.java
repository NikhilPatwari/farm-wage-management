package com.farm.wagemanagement.model;

import javax.persistence.Embeddable;

@Embeddable
public class Contract {
    String type;
    double ratePerItem;
}

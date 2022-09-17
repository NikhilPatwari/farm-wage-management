package com.farm.wagemanagement.model.TODO;

import com.farm.wagemanagement.model.Organization;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
public class IncomeBill {
    @Id
    private long id;
    private LocalDate billDate;
    private double billAmount;
    private String imagePath;
    private String bankAccount;
    private double amount;
    private String paymentStatus;
    private LocalDate probableConfirmationDate;
    private String produce;
    private double quantity;
    private String quantityUnit;
    private double rate;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "buyerId",
            referencedColumnName = "id"
    )
    private Buyer buyer;
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
            name = "incomeSourceId",
            referencedColumnName = "id"
    )
    private IncomeSource incomeSource;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name = "paymentModeId",
            referencedColumnName = "id"
    )
    private IncomeSource.PaymentMode paymentMode;
}

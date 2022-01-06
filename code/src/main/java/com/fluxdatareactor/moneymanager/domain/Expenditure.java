package com.fluxdatareactor.moneymanager.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("expenditure")
public class Expenditure {

    @Id
    private String name;
    private String category;
    private Double amount;

    // TODO: Add a customer object here
    private String customer;

}

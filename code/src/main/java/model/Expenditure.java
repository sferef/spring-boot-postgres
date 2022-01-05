package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "expenditure")
public class Expenditure {

    @Id
    private String name;
    private String category;
    private Double amount;

    // TODO: Add a customer object here
    private String customer;

}

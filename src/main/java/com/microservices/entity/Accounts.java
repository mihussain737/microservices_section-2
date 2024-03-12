package com.microservices.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @AllArgsConstructor @NoArgsConstructor
@Setter @ToString
@Table
public class Accounts extends BaseEntity{


    @Column(name = "customer_id")
    private Long customerId;

    @Id
    @Column(name="account_number")
    private  Long accountNumber;

    @Column(name="account_type")
    private String accountType;

    @Column(name="branch_address")
    private String branchAddress;
}

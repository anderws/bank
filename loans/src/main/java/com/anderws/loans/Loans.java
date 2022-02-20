package com.anderws.loans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Loans {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "loan_number")
    private Long loanNumber;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "start_dt")
    private Date startDt;

    @Column(name = "loan_type")
    private String loanType;

    @Column(name = "total_loan")
    private int totalLoan;

    @Column(name = "amount_paid")
    private int amountPaid;

    @Column(name = "outstanding_amount")
    private int outstandingAmount;

    @Column(name = "create_dt")
    private LocalDate createDt;
}

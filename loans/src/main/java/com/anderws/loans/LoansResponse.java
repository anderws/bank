package com.anderws.loans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoansResponse {

    private Long loanNumber;

    private Long customerId;

    private Date startDt;

    private String loanType;

    private int totalLoan;

    private int amountPaid;

    private int outstandingAmount;

    private LocalDate createDt;

    public LoansResponse(Loans loans) {
        this.loanNumber = loans.getLoanNumber();
        this.customerId = loans.getCustomerId();
        this.startDt = loans.getStartDt();
        this.loanType = loans.getLoanType();
        this.totalLoan = loans.getTotalLoan();
        this.amountPaid = loans.getAmountPaid();
        this.outstandingAmount = loans.getOutstandingAmount();
        this.createDt = loans.getCreateDt();
    }

    public static List<LoansResponse> convert(List<Loans> list) {
        return list.stream().map(LoansResponse::new).collect(Collectors.toList());
    }
}

package com.anderws.accounts;

import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
public class AccountsResponse {

    private Long accountNumber;
    private Long customerId;
    private String accountType;
    private String branchAddress;
    private LocalDate createDt;

    public AccountsResponse(Accounts accounts) {
        this.accountNumber = accounts.getAccountNumber();
        this.customerId = accounts.getCustomerId();
        this.accountType = accounts.getAccountType();
        this.branchAddress = accounts.getBranchAddress();
        this.createDt = accounts.getCreateDt();
    }
}

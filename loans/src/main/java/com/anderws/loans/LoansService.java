package com.anderws.loans;

import java.util.List;

public interface LoansService {

    List<Loans> findByCustomerIdOrderByStartDtDesc(Long customerId);
}

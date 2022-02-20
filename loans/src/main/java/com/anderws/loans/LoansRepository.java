package com.anderws.loans;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoansRepository extends JpaRepository<Loans, Long> {

    List<Loans> findByCustomerIdOrderByStartDtDesc(Long customerId);
}

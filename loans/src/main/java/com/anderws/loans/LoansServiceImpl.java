package com.anderws.loans;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class LoansServiceImpl implements LoansService{

    private final LoansRepository loansRepository;

    @Override
    public List<Loans> findByCustomerIdOrderByStartDtDesc(Long customerId) {
        return loansRepository.findByCustomerIdOrderByStartDtDesc(customerId);
    }
}

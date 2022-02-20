package com.anderws.accounts;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AccountsServiceImpl implements AccountsService{

    private final AccountsRepository accountsRepository;

    @Override
    public Accounts findByCustomerId(Long customerId) {
        return accountsRepository.findByCustomerId(customerId);
    }
}

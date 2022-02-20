package com.anderws.accounts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Accounts findByCustomerId(Long customerId);
}

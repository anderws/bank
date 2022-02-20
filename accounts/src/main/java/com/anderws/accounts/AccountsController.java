package com.anderws.accounts;

import com.anderws.accounts.customers.CustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountsController {

    private final AccountsService accountsService;

    @PostMapping("/myAccount")
    public ResponseEntity<AccountsResponse> getAccountsDetails(@RequestBody CustomerRequest request){
        Accounts accounts = accountsService.findByCustomerId(request.getCustomerId());
        if(null != accounts){
            AccountsResponse response =  new AccountsResponse(accounts);
            return ResponseEntity.ok(response);
        }
        return ResponseEntity.notFound().build();
    }
}

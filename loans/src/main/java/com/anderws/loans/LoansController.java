package com.anderws.loans;

import com.anderws.loans.customers.CustomerRequest;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/loans")
public class LoansController {

    private final LoansService loansService;

    @PostMapping("/myLoans")
    public ResponseEntity<?> getLoansDetails(@RequestBody CustomerRequest request){
        List<Loans> list = loansService.findByCustomerIdOrderByStartDtDesc(request.getCustomerId());
        if(list.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(LoansResponse.convert(list));
    }

}

package com.anderws.cards;

import com.anderws.cards.customers.CustomerRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/cards")
public class CardsContoller {

    private final CardsService cardsService;

    @PostMapping("/myCards")
    public ResponseEntity<?> getCardDetails(@RequestBody CustomerRequest request){
        List<Cards> list = cardsService.findByCustomerId(request.getCustomerId());
        if(list.isEmpty()){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok(CardsResponse.convert(list));
    }
}

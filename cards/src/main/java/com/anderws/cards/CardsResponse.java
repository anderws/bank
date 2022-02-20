package com.anderws.cards;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CardsResponse {

    private Long cardId;
    private Long customerId;
    private String cardNumber;
    private String cardType;
    private int totalLimit;
    private int amountUsed;
    private int availableAmount;
    private LocalDate createDt;

    public CardsResponse(Cards cards){
        this.cardId = cards.getCardId();
        this.customerId = cards.getCustomerId();
        this.cardNumber = cards.getCardNumber();
        this.cardType = cards.getCardType();
        this.totalLimit = cards.getTotalLimit();
        this.amountUsed = cards.getAmountUsed();
        this.availableAmount = cards.getAvailableAmount();
        this.createDt = cards.getCreateDt();
    }

    public static List<CardsResponse> convert(List<Cards> list) {
        return list.stream().map(CardsResponse::new).collect(Collectors.toList());
    }
}

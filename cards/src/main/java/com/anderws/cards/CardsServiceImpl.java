package com.anderws.cards;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CardsServiceImpl implements CardsService{

    private final CardsRepository cardsRepository;
    @Override
    public List<Cards> findByCustomerId(Long customerId) {
        return cardsRepository.findByCustomerId(customerId);
    }
}

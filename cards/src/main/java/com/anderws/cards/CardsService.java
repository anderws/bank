package com.anderws.cards;

import java.util.List;

public interface CardsService {

    List<Cards> findByCustomerId(Long customerId);
}

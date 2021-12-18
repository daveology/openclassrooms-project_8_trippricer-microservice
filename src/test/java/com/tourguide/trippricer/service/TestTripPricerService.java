package com.tourguide.trippricer.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tripPricer.Provider;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestTripPricerService {

    @Autowired
    TripPricerService tripPricerService;

    @Test
    public void shouldGetTripDeals() {

        List<Provider> providers = tripPricerService.getPrice("", UUID.randomUUID(), 1, 1, 1, 1);

        assertEquals(5, providers.size());
    }
}

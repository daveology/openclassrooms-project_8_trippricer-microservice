package com.tourguide.trippricer.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestTripPricerController {

    @Autowired
    private MockMvc mock;

    @Test
    public void shouldAccessTripDeals() throws Exception {

        mock.perform(get("/getTripPrice").param("key", "").param("attractionUuid", String.valueOf(UUID.randomUUID())).param("adultsCount", "0").param("childrenCount", "0").param("nightsNumber", "0").param("rewardsPoints", "0"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.size()", is(5)));
    }
}

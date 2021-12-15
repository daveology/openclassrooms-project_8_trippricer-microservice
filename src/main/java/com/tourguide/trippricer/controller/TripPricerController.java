package com.tourguide.trippricer.controller;

import com.tourguide.trippricer.service.TripPricerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tripPricer.Provider;

import java.util.List;
import java.util.UUID;

@RestController
public class TripPricerController {

    @Autowired
    TripPricerService tripPricerService;

    @GetMapping(value="/getTripPrice")
    public List<Provider> getPrice(@RequestParam String key,
                                   @RequestParam UUID attractionUuid,
                                   @RequestParam int adultsCount,
                                   @RequestParam int childrenCount,
                                   @RequestParam int nightsNumber,
                                   @RequestParam int rewardsPoints) {

        return tripPricerService.getPrice(key, attractionUuid, adultsCount,
                childrenCount, nightsNumber, rewardsPoints);
    }
}

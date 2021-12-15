package com.tourguide.trippricer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import tripPricer.Provider;
import tripPricer.TripPricer;

import java.util.List;
import java.util.UUID;

@Service
public class TripPricerService {

    private Logger logger = LogManager.getLogger(TripPricerService.class);
    TripPricer tripPricer = new TripPricer();

    public List<Provider> getPrice(String key,
                                   UUID attractionUuid,
                                   int adultsCount,
                                   int childrenCount,
                                   int nightsNumber,
                                   int rewardsPoints) {

        logger.debug("Trip price received!");

        return tripPricer.getPrice(key, attractionUuid, adultsCount,childrenCount, nightsNumber, rewardsPoints);
    }
}

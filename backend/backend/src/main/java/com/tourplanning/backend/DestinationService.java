package com.tourplanning.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DestinationService {

    @Autowired //Tells we want the framework to instantiate this class for us
    private DestinationRepository destinations;

    public List<Destinations> getAllDestinations() {
        return destinations.findAll();
    }

    public Optional<Destinations> getSingleDestination(String state) {
        return destinations.findDestinationsByState(state);
    }
}

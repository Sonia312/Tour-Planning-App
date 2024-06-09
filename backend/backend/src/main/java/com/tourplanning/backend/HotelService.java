package com.tourplanning.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    @Autowired //Tells we want the framework to instantiate this class for us
    private HotelRepository hotels;

    public List<Hotel> getAllHotels() {
        return hotels.findAll();
    }

    public Optional<Hotel> getSingleHotel(String state) {
        return hotels.findHotelByState(state);
    }
}

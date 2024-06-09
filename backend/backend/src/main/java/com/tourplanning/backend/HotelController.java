package com.tourplanning.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Rest API controller
@RequestMapping("/hotel") // Which page inside localhost:8080
@CrossOrigin(origins = "*")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    // String can be returned but it is a good practice to return ResponseEntity
    // while using Spring boot
    // When you go to powershell and type curl -i and localhost:8080/login
    // You will observe you actually get 200 or HttpStatus.OK response
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        return new ResponseEntity<List<Hotel>>(hotelService.getAllHotels(), HttpStatus.OK);
    }

    @GetMapping("/{state}")
    public ResponseEntity<Optional<Hotel>> getSingleHotel(@PathVariable String state) {
        return new ResponseEntity<Optional<Hotel>>(hotelService.getSingleHotel(state), HttpStatus.OK);
    }

}

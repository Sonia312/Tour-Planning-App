package com.tourplanning.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Rest API controller
@RequestMapping("/destination") // Which page inside localhost:8080
@CrossOrigin(origins = "*")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    // String can be returned, but it is a good practice to return ResponseEntity
    // while using Spring boot
    // When you go to powershell and type curl -i and localhost:8080/login
    // You will observe you actually get 200 or HttpStatus.OK response
    @GetMapping
    public ResponseEntity<List<Destinations>> getAllDestinations() {
        return new ResponseEntity<List<Destinations>>(destinationService.getAllDestinations(), HttpStatus.OK);
    }

    @GetMapping("/{state}")
    public ResponseEntity<Optional<Destinations>> getSingleDestinations(@PathVariable String state) {
        return new ResponseEntity<Optional<Destinations>>(destinationService.getSingleDestination(state), HttpStatus.OK);
    }

}

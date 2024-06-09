package com.tourplanning.backend;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DestinationRepository extends MongoRepository<Destinations, ObjectId> {
    Optional<Destinations> findDestinationsByState(String state);
}

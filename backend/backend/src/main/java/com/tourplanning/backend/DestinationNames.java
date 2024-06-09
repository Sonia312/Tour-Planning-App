package com.tourplanning.backend;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "DestinationNames")
@Data // Takes care of all getter setter methods
@AllArgsConstructor
@NoArgsConstructor
public class DestinationNames {
    @Id
    private ObjectId id;

    private String placeName;

    @DocumentReference
    private DestinationLocations places; // Manual Reference relationship

}

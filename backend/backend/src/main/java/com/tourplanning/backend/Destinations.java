package com.tourplanning.backend;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Destinations")
@Data // Takes care of all getter setter methods
@AllArgsConstructor
@NoArgsConstructor
public class Destinations {
    @Id
    private ObjectId id;

    private String state;

    @DocumentReference
    private List<DestinationNames> places; // Manual Reference relationship

}

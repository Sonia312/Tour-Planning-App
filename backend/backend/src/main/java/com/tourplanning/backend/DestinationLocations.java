package com.tourplanning.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DestinationLocations")
@Data // Takes care of all getter setter methods
@AllArgsConstructor
@NoArgsConstructor
public class DestinationLocations {

    @Id
    private ObjectId id;

    private float latitude;

    private float longitude;

}

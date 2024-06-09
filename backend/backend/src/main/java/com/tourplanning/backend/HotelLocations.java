package com.tourplanning.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "HotelLocations")
@Data // Takes care of all getter setter methods
@AllArgsConstructor
@NoArgsConstructor
public class HotelLocations {

    @Id
    private ObjectId id;

    private float latitude;

    private float longitude;

}

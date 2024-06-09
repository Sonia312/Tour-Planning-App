package com.tourplanning.backend;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import javax.xml.stream.Location;
import java.util.List;

@Document(collection = "Hotel")
@Data // Takes care of all getter setter methods
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    private ObjectId id;

    private String state; // Manual Reference relationship

    @DocumentReference
    private List<HotelNames> hotelNames;

}

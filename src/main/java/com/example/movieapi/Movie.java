package com.example.movieapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId id;
    private String imdbid;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> generes;
    private List<String> brackdrops;

    @DocumentReference
    private List<Review> reviewIds;
}

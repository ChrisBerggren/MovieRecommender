package com.movierecommender;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Movie {

    public String name;
    public int length;
    public int releaseYear;

    @Builder.Default
    public List<String> genres = new ArrayList<>();
}

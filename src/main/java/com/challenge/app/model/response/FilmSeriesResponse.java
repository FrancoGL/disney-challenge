package com.challenge.app.model.response;


public record FilmSeriesResponse(
    String title,
    String releaseDate,
    Integer rating,
    String image,
    Long genreId
) {

}

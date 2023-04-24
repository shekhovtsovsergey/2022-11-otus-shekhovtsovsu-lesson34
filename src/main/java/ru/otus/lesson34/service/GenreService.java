package ru.otus.lesson34.service;

import ru.otus.lesson34.dto.GenreDto;
import ru.otus.lesson34.exception.GenreNotFoundException;

import java.util.List;

public interface GenreService {

    List<GenreDto> getAllGenre() throws GenreNotFoundException;
    GenreDto getGenreById(Long id) throws GenreNotFoundException;


}

package ru.otus.lesson34.service;

import ru.otus.lesson34.dto.AuthorDto;
import ru.otus.lesson34.exception.AuthorNotFoundException;

import java.util.List;

public interface AuthorService {

    List<AuthorDto> getAllAuthore() throws AuthorNotFoundException;

}

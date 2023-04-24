package ru.otus.lesson34.service;

import ru.otus.lesson34.dto.CommentDto;
import ru.otus.lesson34.exception.BookNotFoundException;

import java.util.List;

public interface CommentService {

    List<CommentDto> getAllCommentsByBook(Long id) throws BookNotFoundException;

}

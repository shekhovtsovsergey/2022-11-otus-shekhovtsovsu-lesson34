package ru.otus.lesson34.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.lesson34.model.Book;
import ru.otus.lesson34.model.Comment;

public interface CommentDao extends JpaRepository<Comment, Long> {

    void deleteByBook(Book book);
}

package ru.otus.lesson34.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.lesson34.model.Author;

public interface AuthorDao extends JpaRepository<Author, Long> {

}

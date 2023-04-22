package ru.otus.lesson34.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.lesson34.model.Genre;

public interface GenreDao extends JpaRepository<Genre, Long> {

}
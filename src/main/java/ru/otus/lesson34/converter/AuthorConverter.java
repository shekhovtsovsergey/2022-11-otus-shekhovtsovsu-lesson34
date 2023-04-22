package ru.otus.lesson34.converter;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.otus.lesson34.dto.AuthorDto;
import ru.otus.lesson34.model.Author;

@Component
@RequiredArgsConstructor
public class AuthorConverter {

    public AuthorDto entityToDto(Author author) {
        return new AuthorDto(author.getId(), author.getName());
    }

}

package io.honeymon.tacademy.springboot.serivce;

import io.honeymon.tacademy.springboot.domain.Book;
import io.honeymon.tacademy.springboot.domain.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface BookService {
    Optional<Book> findById(Long id);

}

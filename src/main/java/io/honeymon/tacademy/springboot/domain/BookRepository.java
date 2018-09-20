package io.honeymon.tacademy.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByNameLike(String name);
    List<Book> findByNameStartingWith(String name);
    List<Book> findByNameContaining(String name);

}

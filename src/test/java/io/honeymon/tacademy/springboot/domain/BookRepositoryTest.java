package io.honeymon.tacademy.springboot.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    BookRepository repository;

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("book-spring-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789123");
        assertThat(book.isNew()).isTrue();

        repository.save(book);
        assertThat(book.isNew()).isFalse();
    }

    @Test
    public void testFindByNameLike(){
        Book book = new Book();
        book.setName("book-spring-boot");
        book.setIsbn10("0123456789");
        book.setIsbn13("0123456789123");

        repository.save(book);

        List<Book> books= repository.findByNameStartingWith("book");
        System.out.print("*****"+books);
        assertThat(books).isNotEmpty();
        books= repository.findByNameContaining("book");
        System.out.print("*****"+books);

        assertThat(books).isNotEmpty();

    }


}

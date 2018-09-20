package io.honeymon.tacademy.springboot.service;

import io.honeymon.tacademy.springboot.serivce.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test(expected = RuntimeException.class)
    public void testFindById(){
        Long id =1L;
        bookService.findById(id)
                .orElseThrow(()-> new RuntimeException("not Found"));
    }
}

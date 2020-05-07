package com.aaa.lwq.springcloud.controller;

import com.aaa.lwq.springcloud.model.Book;
import com.aaa.lwq.springcloud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/04/27 20:00
 * @Description:
 */
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<Book> selectAllBooks() {
        return bookService.selectAllBooks();
    }
}

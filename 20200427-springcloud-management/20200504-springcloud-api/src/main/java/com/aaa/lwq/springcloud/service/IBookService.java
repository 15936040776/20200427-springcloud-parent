package com.aaa.lwq.springcloud.service;

import com.aaa.lwq.springcloud.fallback.FallbackService;
import com.aaa.lwq.springcloud.model.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@FeignClient(value = "book-provider", fallbackFactory = FallbackService.class)
// @FeignClient(value = "book-provider")
public interface IBookService {

    @GetMapping("/all")
    List<Book> selectAllBooks();

}
package com.aaa.lwq.springcloud.controller;

import com.aaa.lwq.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/04/27 20:10
 * @Description:
 */
@RestController
public class BookController {

    @Autowired
    private RestTemplate restTemplate;
    /**
     * @Author : lwq
     * @Description :
     *      查询所有的图书信息(服务的消费者)
     * @Params : []
     * @Date : 2020/4/27
     * @Return : java.util.List<Book>
    */
    @GetMapping("/bookAll")
    public List<Book> selectAllBooks() {
        return restTemplate.getForObject("http://localhost:8081/all", List.class);
    }

}

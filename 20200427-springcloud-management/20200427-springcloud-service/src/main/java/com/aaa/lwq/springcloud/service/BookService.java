package com.aaa.lwq.springcloud.service;

import com.aaa.lwq.springcloud.mapper.BookMapper;
import com.aaa.lwq.springcloud.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/04/27 20:22
 * @Description:
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    /**
     * @Author : lwq
     * @Description :
     *      查询所有图书信息
     * @Params : []
     * @Date : 2020/4/27
     * @Return : java.util.List<com.aaa.lwq.springcloud.model.Book>
    */
    public List<Book> selectAllBooks() {
        return bookMapper.selectAll();
    }

}

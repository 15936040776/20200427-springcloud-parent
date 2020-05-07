package com.aaa.lwq.springcloud.fallback;

import com.aaa.lwq.springcloud.model.Book;
import com.aaa.lwq.springcloud.service.IBookService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FallbackService implements FallbackFactory<IBookService> {


    public IBookService create(Throwable throwable) {
            IBookService bookService = new IBookService() {
                public List<Book> selectAllBooks() {
                    System.out.println("目前服务器正在处于降级阶段，请等待恢复通知！！");
                    return null;
                }
            };
            return bookService;
        }
    }


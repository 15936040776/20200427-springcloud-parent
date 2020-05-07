package com.aaa.lwq.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/04/27 19:59
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.aaa.lwq.springcloud.mapper")
public class WebApplication8081 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication8081.class,args);
    }
}

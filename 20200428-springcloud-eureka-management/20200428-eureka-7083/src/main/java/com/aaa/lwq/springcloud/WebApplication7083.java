package com.aaa.lwq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/04/29 10:22
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class WebApplication7083 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication7083.class,args);
    }
}

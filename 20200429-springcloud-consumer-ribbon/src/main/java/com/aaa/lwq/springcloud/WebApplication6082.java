package com.aaa.lwq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/05/06 11:43
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class WebApplication6082 {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication6082.class,args);
    }
}

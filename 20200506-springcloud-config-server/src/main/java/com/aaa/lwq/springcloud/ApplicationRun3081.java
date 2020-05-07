package com.aaa.lwq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Program: 20200427-springcloud-parent
 * @Author: lwq
 * @Create: 2020/05/07 14:58
 * @Description:
 */
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class,args);
    }
}

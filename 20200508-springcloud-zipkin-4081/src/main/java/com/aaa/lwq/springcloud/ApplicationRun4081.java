package com.aaa.lwq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/8 16:02
 * @Description
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun4081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun4081.class, args);
    }

}

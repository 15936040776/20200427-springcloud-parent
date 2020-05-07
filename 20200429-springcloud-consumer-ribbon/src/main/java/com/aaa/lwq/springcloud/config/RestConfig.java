package com.aaa.lwq.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        // TODO 自己去完成负载均衡的算法(我讲)
        return new RestTemplate();
    }

    /**
     * @author Seven Lee
     * @description
     *      随机算法
     * @param []
     * @date 2020/4/29
     * @return com.netflix.loadbalancer.IRule
     * @throws
    **/
    /*@Bean
    public IRule mineRule() {
        return new RandomRule();
    }*/
}

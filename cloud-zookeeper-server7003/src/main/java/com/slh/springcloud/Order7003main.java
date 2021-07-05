package com.slh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import sun.java2d.pipe.AATextRenderer;

/**
 * @Author SLH
 * @create 2021/7/5 10:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order7003main {
    public static void main(String[] args) {
        SpringApplication.run(Order7003main.class, args);
    }
}

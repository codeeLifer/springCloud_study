package com.slh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author SLH
 * @create 2021/7/5 16:11
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OderMainConsul {
    public static void main(String[] args) {
        SpringApplication.run(OderMainConsul.class,args);
    }
}

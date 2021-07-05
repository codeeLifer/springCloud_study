package com.slh.springcloud;

import com.slh.springcloud.entities.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author SLH
 * @create 2021/7/5 15:37
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment8004main {
    public static void main(String[] args) {
        SpringApplication.run(Payment8004main.class,args);
    }
}

package com.slh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author SLH
 * @create 2021/6/30 19:52
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7002.class,args);
    }
}

package com.slh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.swing.*;

/**
 * @Author SLH
 * @create 2021/6/30 9:38
 */
@EnableEurekaClient
@SpringBootApplication
public class OderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderMain80.class,args);
    }
}

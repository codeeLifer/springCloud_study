package com.slh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author SLH
 * @create 2021/7/5 15:55
 */
@RestController
public class Mycontroller {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/hello")
    public String sayHello(){
        return "springcloud with zookeeper, serverPort: "+serverPort+" "+ UUID.randomUUID().toString();
    }
}

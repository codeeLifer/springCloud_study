package com.slh.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.UUID;

/**
 * @Author SLH
 * @create 2021/7/4 16:42
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/hello")
    public String sayHello(){
        return "springcloud with zookeeper, serverPort: "+serverPort+" "+UUID.randomUUID().toString();
    }
}

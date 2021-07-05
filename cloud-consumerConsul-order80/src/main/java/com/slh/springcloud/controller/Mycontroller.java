package com.slh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author SLH
 * @create 2021/7/5 16:15
 */
@RestController
public class Mycontroller {
    private static final String INVOKE_URL = "http://payment-provider-8004";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/hello")
    public String testConsul(){
        return restTemplate.getForObject(INVOKE_URL+"/payment/hello",String.class);
    }
}

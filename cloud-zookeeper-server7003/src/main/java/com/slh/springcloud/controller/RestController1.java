package com.slh.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author SLH
 * @create 2021/7/5 10:53
 */
@RestController
public class RestController1 {
    private static String url = "http://payment-service-8003";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/hello")
    public String rpcPayment(){
        return restTemplate.getForObject(url+"/payment/hello",String.class);
    }
}

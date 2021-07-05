package com.slh.springcloud.controller;

import com.slh.springcloud.entities.CommonResult;
import com.slh.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.stream.events.Comment;

/**
 * @Author SLH
 * @create 2021/6/30 9:42
 */
@RestController
@Slf4j
public class OrderController {

    @Autowired
    private RestTemplate rt;


    private static String url = "http://CLOUD-PAYMENT-SERVICE/";


    @GetMapping(value = "consumer/payment/create")
    public CommonResult create(Payment payment) {
//        url = "http://localhost:8001/";
        log.info("从浏览器获取到的数据：" + payment);
        return rt.postForObject(url + "payment/create", payment, CommonResult.class);
    }

    @GetMapping(value = "consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
//        url = "http://localhost:8001/";
        return rt.getForObject(url + "payment/get/{id}", CommonResult.class, id);
    }

}

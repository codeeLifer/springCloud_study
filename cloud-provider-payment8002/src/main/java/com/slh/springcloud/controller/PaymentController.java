package com.slh.springcloud.controller;

import com.slh.springcloud.entities.CommonResult;
import com.slh.springcloud.entities.Payment;
import com.slh.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

/**
 * @Author SLH
 * @create 2021/6/29 21:25
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService ps;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping("/payment")
    public Payment testPayment(@PathParam("id") Long id) {
        return ps.getPaymentById(id);
    }

    @PostMapping(value = "/payment/create")
    public CommonResult<Integer> create(@RequestBody Payment payment) {
        int result = ps.create(payment);
        log.info("*****插入结果：" + result);
        if (result > 0) {
            return new CommonResult<Integer>(200, "端口号："+ serverPort +" 插入数据库成功", result);
        } else {
            return new CommonResult<Integer>(444, "插入数据库失败");
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") long id) {
        Payment result = ps.getPaymentById(id);
        log.info("*****插入结果：" + result);
        if (result != null) {
            return new CommonResult<Payment>(200, "端口号："+ serverPort +" 查询成功", result);
        } else {
            return new CommonResult<Payment>(444, "数据库中没有记录");
        }
    }
}

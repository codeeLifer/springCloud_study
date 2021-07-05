package com.slh.springcloud.service;

import com.slh.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author SLH
 * @create 2021/6/29 21:22
 */
public interface PaymentService {
    /**
     * 保存一条数据到数据库
     * @param payment 数据
     * @return 成功或者失败的标志位
     */
    public int create(Payment payment);

    /**
     * 通过id查询数据库
     * @param id 查询的id
     * @return 查询记录
     */
    public Payment getPaymentById(@Param("id") long id);
}

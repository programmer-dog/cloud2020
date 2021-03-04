package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entites.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment queryById(@Param("id") Long id);
}

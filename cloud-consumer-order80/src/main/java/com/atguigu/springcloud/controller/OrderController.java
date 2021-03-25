package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENR_URL="http://localhost:8001";
    public static final String PAYMENR_URL="http://CLOUD-PAYMENT-SERVICE";    //eureka服务注册的名称，关注的是服务
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sonsumer/payment/create")
    public CommonResult<Payment> creat(Payment payment){
        return restTemplate.postForObject(PAYMENR_URL +  "/payment/create",payment,CommonResult.class);
    }

    @GetMapping("comsummer//payment/get/{id}")
    public CommonResult<Payment> queryById(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENR_URL +  "/payment/get/"+id,CommonResult.class);
    }
}

package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entites.CommonResult;
import com.atguigu.springcloud.entites.Payment;
import com.atguigu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private PaymentService paymentService;

    /**
     * 插入
     * @param payment
     * @return
     */
    @PostMapping(value = "/payment/create")
    public CommonResult creat (@RequestBody Payment payment){
        CommonResult commonResult = new CommonResult();
        int result = paymentService.create(payment);
        log.info("***************插入结果************************" +result + "端口号" + serverPort );
        if(result>0){
            commonResult.setCode(200);
            commonResult.setData(result);
            commonResult.setMessage("插入成功！");
            return commonResult;
        }else{
            return   new CommonResult(200,result,"插入失败！");
        }

    }

    /**
     * 查询
     * @param id
     * @return
     */
    @GetMapping(value = "payment/get/{id}")
    public CommonResult queryById (@PathVariable("id") Long id){
        CommonResult commonResult = new CommonResult();
        Payment payment = paymentService.queryById(id);
        log.info("***************查詢结果************************" +payment);
        if(payment!=null){
            return new CommonResult(200,payment,"查询成功！" +serverPort);
        }else{
            return   new CommonResult(444,payment,"查询失败！");
        }

    }

}

package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.math.BigDecimal;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
        BigDecimal a = new BigDecimal("616");
        BigDecimal b = new BigDecimal("4400");
        System.out.println("计算的记过为："+ getpercent( a,b));
        getpercent( a,b);
    }

    /**
     * 获得百分比
     * @param a 被除数
     * @param b 除数
     * @return
     */
    public static String getpercent(BigDecimal a, BigDecimal b){
        if(b.compareTo(new BigDecimal(0))==0){
            return "";
        }
        if(b.compareTo(new BigDecimal(0))==0){
            return "0.00%";
        }
        return  a.divide(b,4,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100")).setScale(2,BigDecimal.ROUND_HALF_UP)+"%";
    }

}

package com.atguigu.springcloud;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 */
@RequestMapping("/test")
public class Test {
    @RequestMapping("/test")
    public  String getTest(){
        return "sss";
    }
}

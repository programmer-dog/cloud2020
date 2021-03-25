package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @描述
 * @创建人 gaozc
 * @创建时间 $
 * @LoadBalanced 开启负载均衡机制，一个服务名下面可能有多台服务器，不知道访问哪一台。
 *  @LoadBalanced 赋予了RestTemplate 负载均衡的能力
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //@LoadBalanced 赋予了RestTemplate 负载均衡的能力
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }
}

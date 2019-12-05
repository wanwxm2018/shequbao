package com.minghong.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author 余建强
 * @date 2019/12/4 13:25
 */
@EnableZuulProxy
@SpringCloudApplication
public class SqbGateway {
    public static void main(String[] args){
        SpringApplication.run(SqbGateway.class);
    }
}

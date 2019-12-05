package com.minghong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 余建强
 * @date 2019/12/4 13:13
 */
@EnableEurekaServer
@SpringBootApplication
public class SqbRegistry {
    public static void main(String[] args){
        SpringApplication.run(SqbRegistry.class);
    }
}

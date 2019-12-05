package com.sqb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 余建强
 * @date 2019/12/4 14:27
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.sqb.item.mapper")
public class SqbItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(SqbItemApplication.class, args);
    }
}

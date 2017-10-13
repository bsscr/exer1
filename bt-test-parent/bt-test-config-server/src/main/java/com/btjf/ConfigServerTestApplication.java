package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/12.
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerTestApplication.class, args);
    }
}

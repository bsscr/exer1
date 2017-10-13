package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/12.
 */
@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigEurekaServerTestApplication.class, args);
    }
}

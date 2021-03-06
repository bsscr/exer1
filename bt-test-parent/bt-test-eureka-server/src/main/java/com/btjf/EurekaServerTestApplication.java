package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Version: 1.0
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTestApplication.class, args);
    }
}

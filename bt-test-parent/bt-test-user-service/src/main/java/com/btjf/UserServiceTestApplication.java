package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
public class UserServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceTestApplication.class, args);
    }
}

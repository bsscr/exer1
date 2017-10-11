package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class GatewayServiceTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayServiceTestApplication.class, args);
    }
}

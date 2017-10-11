package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import zipkin.server.EnableZipkinServer;

/**
 * @Version: 1.0
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@SpringBootApplication
@EnableEurekaServer
@EnableEurekaClient
@EnableZipkinServer
public class EurekaServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTestApplication.class, args);
    }
}

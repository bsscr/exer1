package com.btjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerTestApplication.class, args);
    }
}

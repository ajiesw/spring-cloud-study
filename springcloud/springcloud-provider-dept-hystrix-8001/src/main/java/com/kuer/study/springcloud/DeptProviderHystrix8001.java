package com.kuer.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author kuer
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001.class, args);
    }
}
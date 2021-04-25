package com.kuer.study.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author kuer
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kuer.study.springcloud.consumer.service"})
public class DeptConsumer81 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer81.class, args);
    }
}

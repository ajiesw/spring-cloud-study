package com.kuer.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 * @author kuer
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8003 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8003.class, args);
    }
}

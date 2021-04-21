package com.kuer.study.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author kuer
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001.class, args);
    }
}

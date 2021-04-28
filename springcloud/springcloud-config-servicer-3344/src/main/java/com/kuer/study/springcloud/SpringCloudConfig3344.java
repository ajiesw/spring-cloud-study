package com.kuer.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author kuer
 */
@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfig3344.class, args);
    }
}

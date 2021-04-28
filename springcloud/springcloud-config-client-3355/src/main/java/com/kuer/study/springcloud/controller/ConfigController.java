package com.kuer.study.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kuer
 */
@RestController
public class ConfigController {

    @Value("${spring.application.name}")
    private String application;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;
    @Value("${server.port}")
    private String port;

    @GetMapping("config")
    public String getConfig(){
        return "application: " + application + "eurekaServer: " + eurekaServer + "port:" + port;
    }
}

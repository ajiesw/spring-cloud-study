package com.kuer.study.springcloud.consumer.config;

import com.kuer.study.springcloud.config.MyLoadBalancerConfig;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author kuer
 */
@Configuration
@LoadBalancerClient(value = "SPRINGCLOUD-PROVIDER-DEPT", configuration = MyLoadBalancerConfig.class)
public class ConfigBean{
    /**
     * \@LoadBalanced 配置负载均衡实现RestTemplate
     * Ribbon
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

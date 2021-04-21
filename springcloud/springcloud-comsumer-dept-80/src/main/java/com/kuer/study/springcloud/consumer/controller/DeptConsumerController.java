package com.kuer.study.springcloud.consumer.controller;


import com.kuer.study.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author kuer
 */
@RestController
@RequestMapping("consumer/dept")
public class DeptConsumerController {

    /**
     * 提供多种便捷访问http服务的方法，简单的RestFull服务框架
     */
    @Autowired
    private RestTemplate restTemplate;

    private static final String REST_URL_PREFIX = "http://localhost:8001/";

    /**
     * 消费者不应该又service层
     * 使用RestTemplate
     */
    @GetMapping("/dept/{id}")
    public Dept getDept(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/dept/" + id, Dept.class);
    }
    @PostMapping("/dept")
    public Boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX + "dept/dept", dept, Boolean.class);
    }
    @GetMapping("/deptAll")
    public List<Dept> getDeptAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "dept/deptAll", List.class);
    }
}

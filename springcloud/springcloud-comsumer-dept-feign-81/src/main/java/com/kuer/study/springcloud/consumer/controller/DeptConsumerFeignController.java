package com.kuer.study.springcloud.consumer.controller;


import com.kuer.study.springcloud.consumer.service.DeptClientServiceFallbackFactoryImpl;
import com.kuer.study.springcloud.consumer.service.IDeptService;
import com.kuer.study.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author kuer
 */
@RestController
@RequestMapping("feign/consumer/dept")
public class DeptConsumerFeignController {

    /**
     * 自动注入服务
     */
    @Autowired
    private IDeptService deptService;

    /**
     * 消费者不应该又service层
     * 使用RestTemplate
     */
    @GetMapping("/dept/{id}")
    public Dept getDept(@PathVariable("id")Long id){
        return deptService.getDept(id);
    }
    @PostMapping("/dept")
    public Boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }
    @GetMapping("/deptAll")
    public List<Dept> getDeptAll(){
        return deptService.getDeptAll();
    }
}

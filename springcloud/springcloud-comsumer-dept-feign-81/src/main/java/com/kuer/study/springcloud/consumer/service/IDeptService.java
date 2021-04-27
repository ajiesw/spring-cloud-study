package com.kuer.study.springcloud.consumer.service;

import com.kuer.study.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * feign的服务接口
 * @author kuer
 */
@Service
@FeignClient(value = "SPRINGCLOUD-PROVIDER-DEPT", fallbackFactory = DeptClientServiceFallbackFactoryImpl.class)
@RequestMapping("/dept")
public interface IDeptService{

    /**
     * feign
     * @param id
     * @return
     */
    @GetMapping("/dept/{id}")
    Dept getDept(@PathVariable("id")Long id);

    /**
     * feign
     * @param dept
     * @return
     */
    @PostMapping("/dept")
    Boolean addDept(Dept dept);

    /**
     * feign
     * @return
     */
    @GetMapping("/deptAll")
    List<Dept> getDeptAll();
}

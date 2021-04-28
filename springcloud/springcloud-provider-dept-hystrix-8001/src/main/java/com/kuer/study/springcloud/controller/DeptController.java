package com.kuer.study.springcloud.controller;

import com.kuer.study.springcloud.pojo.Dept;
import com.kuer.study.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 提供RestFull服务
 * @author kuer
 */
@RestController
@RequestMapping("dept")
public class DeptController {

    @Autowired
    private DeptService deptService;
    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "queryDeptHystrixById")
    @GetMapping("dept/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id){
        Dept dept = deptService.queryDeptById(id);
        if (dept == null){
            throw new RuntimeException("部门不存在");
        }
        return dept;
    }

    /**
     * 备选方案
     * @param id
     * @return
     */
    public Dept queryDeptHystrixById(@PathVariable("id") Long id){
        return new Dept().setId(id).setDName("部门不存在，Hystrix信息");
    }
}

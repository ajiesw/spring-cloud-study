package com.kuer.study.springcloud.controller;

import com.kuer.study.springcloud.pojo.Dept;
import com.kuer.study.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
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
     * 获取配置信息，得到具体的微服务
     */
    @Autowired
    private DiscoveryClient client;

    /**
     * 添加部门
     * @param dept
     * @return
     */
    @PostMapping("dept")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    @GetMapping("dept/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id){
        return deptService.queryDeptById(id);
    }
    /**
     * 查询全部部门
     * @return
     */
    @GetMapping("deptAll")
    public List<Dept> queryDeptAll() {
        return deptService.queryDeptAll();
    }

    /**
     * 注册进来的微服务，获取一些信息
     * @return
     */
    @GetMapping("discovery")
    public Object discovery(){
        // 获取微服务列表清单
        List<String> services = client.getServices();
        services.forEach(System.out::println);

        // 得到一个具体的服务信息, 根据${Application.name}
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
        instances.forEach(e -> {
            System.out.println(e.getHost() + "\t" + e.getPort() + "\t" + e.getUri() + "\t" + e.getServiceId());
        });

        return this.client;
    }
}

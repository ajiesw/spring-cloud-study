package com.kuer.study.springcloud.consumer.service;

import com.kuer.study.springcloud.pojo.Dept;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 降级
 * @author kuer
 */
@Component
public class DeptClientServiceFallbackFactoryImpl implements FallbackFactory<IDeptService> {
    @Override
    public IDeptService create(Throwable cause) {
        return new IDeptService() {
            @Override
            public Dept getDept(Long id) {
                return new Dept().setId(id).setDName("服务错误请重试");
            }

            @Override
            public Boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public List<Dept> getDeptAll() {
                return new ArrayList<>();
            }
        };
    }
}

package com.kuer.study.springcloud.service.impl;

import com.kuer.study.springcloud.mapper.DeptMapper;
import com.kuer.study.springcloud.pojo.Dept;
import com.kuer.study.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kuer
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return deptMapper.queryDeptById(id);
    }

    @Override
    public List<Dept> queryDeptAll() {
        return deptMapper.queryDeptAll();
    }
}

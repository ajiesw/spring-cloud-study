package com.kuer.study.springcloud.service;

import com.kuer.study.springcloud.pojo.Dept;

import java.util.List;

/**
 * @author kuer
 */
public interface DeptService {
    /**
     * 添加部门
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据id查询部门
     * @param id
     * @return
     */
    Dept queryDeptById(Long id);
    /**
     * 查询全部部门
     * @return
     */
    List<Dept> queryDeptAll();
}

package com.kuer.study.springcloud.mapper;

import com.kuer.study.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kuer
 */
@Repository
@Mapper
public interface DeptMapper {

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

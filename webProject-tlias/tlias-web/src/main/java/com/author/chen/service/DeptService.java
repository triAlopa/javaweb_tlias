package com.author.chen.service;

import com.author.chen.pojo.Dept;

import java.time.LocalDateTime;
import java.util.List;

public interface DeptService {
    /**
     * 查询所有部门 的逻辑处理、
     * @return
     */

    List<Dept> findAll();

    void deleteById(Integer id);

    void save(Dept dept);

    Dept getInfo(Integer deptId);

    void update(Dept dept);
}

package com.author.chen.service.impl;

import com.author.chen.Exception.HavPersonException;
import com.author.chen.mapper.DeptMapper;
import com.author.chen.mapper.EmpMapper;
import com.author.chen.pojo.Dept;
import com.author.chen.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;


@Service
public class DeptServiceImpl implements DeptService {

    //注入 数据持久层 处理对象 返回数据
    @Autowired
    private DeptMapper deptMapper;

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Dept> findAll() {
        return deptMapper.findAll();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deleteById(Integer id) {

        Integer empCount= empMapper.getCountToDept(id);

        if(empCount>0) throw new HavPersonException("该"+id+"班级有人");


        deptMapper.deleteBYId(id);
    }

    @Override
    public void save(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.save(dept);
    }

    @Override
    public Dept getInfo(Integer deptId) {
      return deptMapper.getInfo(deptId);
    }

    @Override
    public void update(Dept dept) {
        dept.setUpdateTime(LocalDateTime.now());
        deptMapper.update(dept);
    }
}

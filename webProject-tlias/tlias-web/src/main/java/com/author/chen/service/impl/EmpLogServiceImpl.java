package com.author.chen.service.impl;


import com.author.chen.mapper.EmpLogMapper;
import com.author.chen.pojo.EmpLog;
import com.author.chen.service.EmpLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmpLogServiceImpl implements EmpLogService {

    @Autowired
    private EmpLogMapper empLogMapper;


    @Transactional(propagation = Propagation.REQUIRES_NEW)//标注表明 始终会为该方法创建一个新事物，即使加入别的事务 导致了回滚，也会创建该方法体内部的新事物
    @Override
    public void insertLog(EmpLog empLog) {
        empLogMapper.insert(empLog);
    }
}
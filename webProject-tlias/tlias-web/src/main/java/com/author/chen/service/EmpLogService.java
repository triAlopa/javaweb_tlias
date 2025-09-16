package com.author.chen.service;


import com.author.chen.pojo.EmpLog;
import org.springframework.stereotype.Service;


@Service
public interface EmpLogService {

    public void insertLog(EmpLog empLog);

}

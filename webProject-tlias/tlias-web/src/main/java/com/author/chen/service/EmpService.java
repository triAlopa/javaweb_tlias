package com.author.chen.service;


import com.author.chen.pojo.Emp;
import com.author.chen.pojo.EmpQueryParam;
import com.author.chen.pojo.LoginInfo;
import com.author.chen.pojo.PageResult;

import java.util.List;

public interface EmpService {
    PageResult<Emp> Page(EmpQueryParam empQueryParam);

    void save(Emp emp);

    List<Emp> findAll();

    void delete(List<Integer> ids);

    Emp info(Integer id);

    void update(Emp emp);

    LoginInfo LoginRequest(Emp emp);
}

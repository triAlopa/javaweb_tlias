package com.author.chen.service;

import com.author.chen.pojo.Clazz;
import com.author.chen.pojo.ClazzQueryParam;
import com.author.chen.pojo.PageResult;

import java.util.List;

public interface ClazzService {
    void save(Clazz clazz);

    List<Clazz> findAll();

    PageResult<Clazz> queryByParam(ClazzQueryParam clazzQueryParam);

    void del(Integer id);

    Clazz info(Integer id);

    void update(Clazz clazz);

}

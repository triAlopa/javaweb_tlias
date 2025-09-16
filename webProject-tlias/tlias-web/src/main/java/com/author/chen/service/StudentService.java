package com.author.chen.service;


import com.author.chen.pojo.PageResult;
import com.author.chen.pojo.Student;
import com.author.chen.pojo.StudentQueryParam;

import java.util.List;

public interface StudentService {
    PageResult<Student> queryParam(StudentQueryParam queryParam);

    void insert(Student student);

    Student findById(Integer id);

    void update(Student student);

    void del(List<Integer> ids);

    void violationById(Integer id, Integer score);
}

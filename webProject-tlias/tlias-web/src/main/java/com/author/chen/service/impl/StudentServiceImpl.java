package com.author.chen.service.impl;

import com.author.chen.Exception.BigIntegerToviolation;
import com.author.chen.mapper.StudentMapper;
import com.author.chen.pojo.PageResult;
import com.author.chen.pojo.Student;
import com.author.chen.pojo.StudentQueryParam;
import com.author.chen.service.StudentService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageResult<Student> queryParam(StudentQueryParam queryParam) {

        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());

        Page<Student> list = studentMapper.queryByParam(queryParam);

        return new PageResult<>(list.getTotal(), list.getResult());
    }

    @Override
    public void insert(Student student) {
        student.setCreateTime(LocalDateTime.now());
        student.setUpdateTime(LocalDateTime.now());

        studentMapper.insert(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public void update(Student student) {
        student.setUpdateTime(LocalDateTime.now());

        studentMapper.update(student);
    }

    @Override
    public void del(List<Integer> ids) {
        studentMapper.del(ids);
    }

    @Override
    public void violationById(Integer id, Integer score) {
        if(score>255) throw new BigIntegerToviolation("数字过大");
        LocalDateTime updateTime = LocalDateTime.now();
        studentMapper.violationById(id,score,updateTime);
    }
}

package com.author.chen.controller;


import com.author.chen.pojo.PageResult;
import com.author.chen.pojo.Result;
import com.author.chen.pojo.Student;
import com.author.chen.pojo.StudentQueryParam;
import com.author.chen.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public Result queryByParam(StudentQueryParam queryParam) {

        log.info("接收请求 {}", queryParam);

        PageResult<Student> list = studentService.queryParam(queryParam);

        return Result.success(list);
    }
    @PostMapping
    public Result addStu(@RequestBody Student student){
        log.info("接收添加请求 {}", student);

        studentService.insert(student);

        return Result.success();
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable("id") Integer id){

        log.info("接收查询id请求 {}", id);

        Student student=studentService.findById(id);

        return Result.success(student);
    }

    @PutMapping()
    public Result update(@RequestBody Student student){

        log.info("接收修改请求 {}", student);

        studentService.update(student);

        return Result.success();
    }

    @DeleteMapping("/{ids}")
    public Result deleteById(@PathVariable List<Integer> ids){
        log.info("接收id ： {}",ids);

        studentService.del(ids);

        return Result.success();
    }

    @PutMapping("/violation/{id}/{score}")
    public Result violationById(@PathVariable Integer id,@PathVariable Integer score){
        log.info("接收id ： {},分数{}",id,score);

        studentService.violationById(id,score);

        return Result.success();
    }
}

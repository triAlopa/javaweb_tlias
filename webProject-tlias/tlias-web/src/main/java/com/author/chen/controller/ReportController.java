package com.author.chen.controller;


import com.author.chen.pojo.JobOptions;
import com.author.chen.pojo.Result;
import com.author.chen.pojo.StudentOptions;
import com.author.chen.service.ReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("/report")
public class ReportController {

    @Autowired
    private ReportService reportService;


    @GetMapping("/empJobData")
    public Result getJobData() {

        JobOptions jobOptions = reportService.countJobData();

        log.info("员工职位数据: {}", jobOptions);

        return Result.success(jobOptions);
    }

    @GetMapping("/empGenderData")
    public Result empGenderData() {

        List<Map<String, Integer>> list = reportService.empGenderData();

        log.info("员工性别数据: {}", list);

        return Result.success(list);
    }

    @GetMapping("/studentDegreeData")
    public Result studentDegreeData(){
        List<Map<String, Object>> list =   reportService.studentDegreeData();

        log.info("学生学历数据: {}", list);

        return Result.success(list);
    }

    @GetMapping("/studentCountData")
    public Result studentCountData(){

        StudentOptions studentOptions=reportService.studentCountData();

        log.info("班级人数数据: {}", studentOptions);

        return Result.success(studentOptions);
    }
}

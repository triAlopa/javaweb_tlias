package com.author.chen.service.impl;

import com.author.chen.mapper.ReportMapper;
import com.author.chen.pojo.JobOptions;
import com.author.chen.pojo.StudentOptions;
import com.author.chen.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;


@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportMapper reportMapper;

    @Override
    public JobOptions countJobData() {
        List<Map<String, Object>> list = reportMapper.CountJobData();

        List jobList = list.stream().map(mapResult -> mapResult.get("pos")).toList();
        List dataList = list.stream().map(mapResult -> mapResult.get("num")).toList();


        return new JobOptions(jobList, dataList);
    }

    @Override
    public List<Map<String, Integer>> empGenderData() {
        return  reportMapper.empGenderData();
    }

    @Override
    public List<Map<String, Object>> studentDegreeData() {
        return reportMapper.studentDegreeData();
    }

    @Override
    public StudentOptions studentCountData() {

        List<Map<String,Object>> list=reportMapper.studentCountData();

        List<Object> name = list.stream().map(s -> s.get("name")).toList();
        List<Object> value = list.stream().map(s -> s.get("value")).toList();

        return new StudentOptions(name,value);
    }
}

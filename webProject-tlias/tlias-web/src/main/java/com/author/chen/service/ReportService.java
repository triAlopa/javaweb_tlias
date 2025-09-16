package com.author.chen.service;

import com.author.chen.pojo.JobOptions;
import com.author.chen.pojo.StudentOptions;

import java.util.List;
import java.util.Map;

public interface ReportService {
    JobOptions countJobData();

    List<Map<String, Integer>> empGenderData();

    List<Map<String, Object>> studentDegreeData();

    StudentOptions studentCountData();
}

package com.author.chen.mapper;


import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ReportMapper {

    @MapKey("pos")
    List<Map<String, Object>> CountJobData();


    List<Map<String, Integer>> empGenderData();

    List<Map<String, Object>> studentDegreeData();


    List<Map<String, Object>> studentCountData();
}

package com.author.chen.mapper;


import com.author.chen.pojo.Student;
import com.author.chen.pojo.StudentQueryParam;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;

@Mapper
public interface StudentMapper {

    Page<Student> queryByParam(StudentQueryParam queryParam);


    @Insert("insert into student(name, no, gender, phone, id_card, is_college, address, " +
            "degree, graduation_date, clazz_id, " +
            " create_time, update_time) " +
            "values (#{name},#{no},#{gender},#{phone},#{idCard},#{isCollege},#{address}," +
            " #{degree},#{graduationDate}, #{clazzId},#{createTime},#{updateTime} ) ")
    void insert(Student student);

    @Select("select * from student where id=#{id}")
    Student findById( Integer id);


    void update(Student student);

    void del(List<Integer> ids);

    void violationById(Integer id, Integer score, LocalDateTime updateTime);

    @Select("select COUNT(*) from student where student.clazz_id=#{id}")
    Integer getCountByClazzId(Integer id);

}

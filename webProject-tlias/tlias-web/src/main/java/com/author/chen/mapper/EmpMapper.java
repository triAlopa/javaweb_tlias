package com.author.chen.mapper;


import com.author.chen.pojo.Emp;
import com.author.chen.pojo.EmpQueryParam;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

/**
 * 员工信息
 */

@Mapper
public interface EmpMapper {


    /*原始 页面分割实现
    @Select("select count(*) from emp e left join dept d on e.dept_id = d.id")
    public Long getTotal();

    @Select("select e.*,d.name as deptName from emp e left join dept d on e.dept_id = d.id " +
            "order by update_time desc limit #{start},#{pageSize}")
    public List<Emp> list(Integer start,Integer pageSize);*/


//    @Select("select e.*,d.name as deptName from emp e left join dept d on e.dept_id = d.id " +
//            "order by update_time desc")
//    public List<Emp> list();


    List<Emp> list(EmpQueryParam empQueryParam);

    // 接收数据库本条插入的数据 返回的自增id 并赋值给 实体 emp的id属性
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username, name, gender, phone, job, salary, image, entry_date, dept_id, create_time, update_time)" +
            "values (#{username},#{name},#{gender},#{phone},#{job},#{salary},#{image},#{entryDate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    @Select("select id, username, password, name, gender,  job, salary, image, entry_date as entryDate, " +
            "dept_id deptId, create_time createTime, update_time  updateTime from emp")
    List<Emp> findAll();


    void delete(List<Integer> ids);


    Emp info(Integer id);

    void update(Emp emp);

    @Select("select count(*) from emp e where  e.dept_id=#{id}")
    Integer getCountToDept(Integer id);
}

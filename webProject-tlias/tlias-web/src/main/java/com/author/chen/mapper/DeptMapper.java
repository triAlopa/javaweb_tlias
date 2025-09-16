package com.author.chen.mapper;


import com.author.chen.pojo.Dept;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeptMapper {

    /**
     * 查询数据 所有部门
     * @return
     */


    //对于结果 mybatis 只有实体类的属性名与查询数据库的列名一致 才可以
    //方式一 名字映射
//    @Results({
//        @Result(column = "create_time", property = "createTime"),
//        @Result(column = "update_time", property = "updateTime")
//    })

    //方式二 起别名
    //@Select("select id, name, create_time as createTime, update_time as updateTime from dept order by update_time desc ")
    //方式三 开启mybatis 的 驼峰命名转换 配置文件
    @Select("select id, name, create_time    , update_time    from dept order by update_time desc ")
    List<Dept> findAll();

    @Delete("delete from dept where id=#{id}")
    void deleteBYId(Integer id);


    @Insert("insert into dept( name, create_time, update_time) VALUES (#{name},#{createTime},#{updateTime})")
    void save(Dept dept);


    @Select("select id, name, create_time, update_time from dept where id=#{deptId}")
    Dept getInfo(Integer deptId);

    @Update("update dept set name=#{name},update_time=#{updateTime} where id=#{id}")
    void update(Dept dept);
}

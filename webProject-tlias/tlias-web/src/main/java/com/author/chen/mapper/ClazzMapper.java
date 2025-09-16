package com.author.chen.mapper;

import com.author.chen.pojo.Clazz;
import com.author.chen.pojo.ClazzQueryParam;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClazzMapper {


    @Insert("insert into clazz(name, room, begin_date, end_date, master_id, subject, create_time, update_time) " +
            "values (#{name},#{room},#{beginDate},#{endDate},#{masterId},#{subject},#{createTime},#{updateTime})")
    void save(Clazz clazz);


    @Select("select id, name, room, begin_date, end_date, master_id, subject, create_time, update_time from clazz")
    List<Clazz> findAll();


    List<Clazz> queryByParam(ClazzQueryParam clazzQueryParam);

    @Delete("delete from clazz where id =#{id}")
    void del(Integer id);


    Clazz info(Integer id);

    @Update("update clazz set clazz.name=#{name},clazz.master_id=#{masterId},room=#{room}," +
            "begin_date=#{beginDate}, end_date=#{endDate},subject=#{subject},update_time=#{updateTime} where id=#{id}")
    void update(Clazz clazz);
}

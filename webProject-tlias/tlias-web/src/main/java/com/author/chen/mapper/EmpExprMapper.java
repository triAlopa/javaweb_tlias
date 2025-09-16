package com.author.chen.mapper;


import com.author.chen.pojo.EmpExpr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *  员工经历操作
 */

@Mapper
public interface EmpExprMapper {



    void insertBatch(List<EmpExpr> exprList);

    void delete(List<Integer> empIds);

    @Select("select id,begin, end, company, job from emp_expr where emp_id=#{id}")
    List<EmpExpr> infos(Integer id);

    void update(EmpExpr empExpr);
}

package com.author.chen.service.impl;

import com.author.chen.mapper.EmpExprMapper;
import com.author.chen.mapper.EmpMapper;
import com.author.chen.pojo.*;
import com.author.chen.service.EmpLogService;
import com.author.chen.service.EmpService;
import com.author.chen.utils.JwtUtils;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.time.LocalDateTime;
import java.util.*;


@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Autowired
    private EmpExprMapper empExprMapper;

    @Autowired
    private EmpLogService empLogService; //为了模拟 事务 里面 如果 (不管前面的代码是否异常)始终要提交 定义在 其它业务层 并且绑定了 事务

    @Override
    public PageResult<Emp> Page(EmpQueryParam empQueryParam) {

        PageHelper.startPage(empQueryParam.getPage(), empQueryParam.getPageSize());

        Page<Emp> empPage = (Page<Emp>) empMapper.list(empQueryParam);

        return new PageResult(empPage.getTotal(), empPage.getResult());
    }

    /**
     * 保存员工信息 逻辑处理层
     *
     * @param emp
     */
    @Transactional(rollbackFor = {Exception.class})//
    //默认是 运行时异常 才会回滚
    // 对于 一个方法 多次对数据持久层 进行增删改、必须保证数据的一致性、即原子化 要么全部提交 要么全部回滚。 这个注解就是添加一个 spring为这个方法开启事务的作用
    @Override
    public void save(Emp emp) {
        try {
            emp.setCreateTime(LocalDateTime.now());
            emp.setUpdateTime(LocalDateTime.now());

            List<EmpExpr> exprList = emp.getExprList();

            empMapper.insert(emp);

            if (!CollectionUtils.isEmpty(exprList)) {
                //设置主键 id
                exprList.forEach(empExpr -> empExpr.setEmpId(emp.getId()));

                empExprMapper.insertBatch(exprList);
            }
        } finally {
            EmpLog empLog = new EmpLog(null, LocalDateTime.now(), "新增员工 ： " + emp);
            empLogService.insertLog(empLog);
        }


    }

    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }


    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void delete(List<Integer> ids) {
        empExprMapper.delete(ids);
        empMapper.delete(ids);
    }

    /**
     * id的emp个人信息表 和工作经历表
     *
     * @param id
     * @return
     */
    @Override
    @Transactional(rollbackFor = {Exception.class})
    public Emp info(Integer id) {
        //查询个人信息 封装到 emp
//        Emp emp = empMapper.info(id);
        //见 xml
       /* //查询个人的工作经历 可能对应到多个 所以封装到集合
        List<EmpExpr> exprList = empExprMapper.infos(id);
        if(!CollectionUtils.isEmpty(exprList)) emp.setExprList(exprList);*/
        return empMapper.info(id);
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void update(Emp emp) {

        //修改员工个人信息
        empMapper.update(emp);
        emp.setUpdateTime(LocalDateTime.now());

        //先删除 再添加  //如果只写修改的话 那么如果删除一段经历 或者添加一段经历就没有用了 因为只写了修改的sql语句
        // 所以 对于这种情况 可以 将 原有的工作经历删除后，在前端发送  内存变量获取到对应的工作经历 将原有的工作经历删除
        //加载新的 工作经历 此为先删后加
        empExprMapper.delete(Arrays.asList(emp.getId()));

        //添加


        //获取 员工经历
        List<EmpExpr> exprList = emp.getExprList();

        if (!CollectionUtils.isEmpty(exprList)) {
            exprList.forEach(s -> {
                s.setEmpId(emp.getId());
            });
            empExprMapper.insertBatch(exprList);
        }
    }

    @Override
    public LoginInfo LoginRequest(Emp emp) {

        Emp empResult = empMapper.loginRequest(emp);

        if(empResult!=null){

            Map<String,Object> dataMap=new HashMap<>();//添加自定义内容体
            dataMap.put("id",empResult.getId());
            dataMap.put("username",empResult.getUsername());
//            String token = Jwts.builder() //构建 jwt
//                    .signWith(SignatureAlgorithm.HS256, "Y2hlbg==")//自定义编码格式 密钥
//                    .addClaims(dataMap)//将内容体添加到载荷
//                    .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))//过期时间 设置为初次登录的一天后
//                    .compact();//完成一条令牌的封装

            String token = JwtUtils.generateJwt(dataMap);

            return new LoginInfo(empResult.getId(), emp.getUsername(), emp.getPassword(), token);//返回
        }

        return null;
    }
}

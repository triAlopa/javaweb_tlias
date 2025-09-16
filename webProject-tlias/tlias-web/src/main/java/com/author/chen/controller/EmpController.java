package com.author.chen.controller;


import com.author.chen.pojo.Emp;
import com.author.chen.pojo.EmpQueryParam;
import com.author.chen.pojo.PageResult;
import com.author.chen.pojo.Result;
import com.author.chen.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController()
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping()
    public Result list(EmpQueryParam empQueryParam) {
        log.info("查询页表 {} ", empQueryParam);
        PageResult<Emp> pageResult = empService.Page(empQueryParam);

        return Result.success(pageResult);
    }

    /**
     * 保存员工信息接口 ，包括员工工作经历
     *
     * @return Result
     */
    @PostMapping
    public Result save(@RequestBody Emp emp) {
        log.info("保存的员工信息为 ： {}", emp);
        empService.save(emp);
        return Result.success();
    }

    /**
     * 查询所有 员工
     */
    @GetMapping("/list")
    public Result findAll() {
        List<Emp> empList = empService.findAll();
        log.info("查找所有员工 {}", empList);
        return Result.success(empList);
    }
    @DeleteMapping()
    public Result delete( @RequestParam List<Integer> ids){

        log.info("删除员工 id为 : {}", ids);

        empService.delete(ids);

        return Result.success();
    }

    /**
     * 根据 id 回显 这个id的emp个人信息表 和工作经历表
     * @param id
     * @return
     */

    @GetMapping("/{id}")
    public Result info(@PathVariable Integer id){
        log.info("查询的id 为 ： {}",id);

        Emp emp=empService.info(id);

        return Result.success(emp);
    }


    /**
     * 根据id 修改员工信息表 工作经历表
     * @param emp
     * @return
     */
    @PutMapping()
    public Result update(@RequestBody Emp emp){

        log.info("修改用户信息: {}",emp);

        empService.update(emp);

        return Result.success();
    }
}

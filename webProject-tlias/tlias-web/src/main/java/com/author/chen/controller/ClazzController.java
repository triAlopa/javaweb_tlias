package com.author.chen.controller;


import com.author.chen.pojo.Clazz;
import com.author.chen.pojo.ClazzQueryParam;
import com.author.chen.pojo.PageResult;
import com.author.chen.pojo.Result;
import com.author.chen.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/clazzs")
public class ClazzController {

    @Autowired
    private ClazzService clazzService;


    /**
     * 添加班级
     */

    @PostMapping()
    public Result save(@RequestBody Clazz clazz) {
        clazzService.save(clazz);
        log.info("添加班级：{}", clazz);
        return Result.success();
    }

    /**
     * 查询所有班级
     */

    @GetMapping("/list")
    public Result list() {
        List<Clazz> clazzList = clazzService.findAll();
        log.info("查询所有班级 ： {}", clazzList);
        return Result.success(clazzList);
    }

    /**
     * 根据请求体条件查询所有班级
     */
    @GetMapping()
    public Result queryClazzs(ClazzQueryParam clazzQueryParam) {
        log.info("查询请求为 : {}", clazzQueryParam);


        PageResult<Clazz> clazzList = clazzService.queryByParam(clazzQueryParam);

        return Result.success(clazzList);
    }

    /**
     * 根据请求路径id 删除班级
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("请求删除id为 : {}", id);
        clazzService.del(id);

        return Result.success();
    }

    /**
     * 根据id 回显数据 用于修改员工
     *
     * @param id
     * @return
     */

    @GetMapping("/{id}")
    public Result queryById(@PathVariable("id") Integer id) {
        log.info("查询id为 : {}", id);

        Clazz clazz = clazzService.info(id);
        return Result.success(clazz);
    }


    @PutMapping()
    public Result update(@RequestBody  Clazz clazz) {
        log.info("修改用户为 : {}", clazz);

        clazzService.update(clazz);

        return Result.success();
    }
}

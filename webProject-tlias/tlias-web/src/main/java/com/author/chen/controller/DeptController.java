package com.author.chen.controller;


import com.author.chen.pojo.Dept;
import com.author.chen.pojo.Result;
import com.author.chen.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RestController
public class DeptController {


    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    public Result list() {
        List<Dept> deptList = deptService.findAll();
        log.info("查询所有部门：{}", deptList);
        return Result.success(deptList);
    }

    //方式一: HttpServletRequest 手动获取 前端的请求参数绑定的值，部分需要格式化别的数据类型
//    @DeleteMapping("/depts")
//    public Result delete(HttpServletRequest http){
//        String idStr = http.getParameter("id");
//        int id = Integer.parseInt(idStr);
//        System.out.println("删除部门id为: "+id);
//        return Result.success();
//    }
    //方式二   使用@RequestParam注解 但是默认（required=true）必须要填这个参数 否则服务端会报错
    // 注解绑定的值 为前端请求的参数名 //null
//    @DeleteMapping("/depts")
//    public Result delete(@RequestParam(value = "id",required = false )  Integer deptId){
//        System.out.println("删除部门id为: "+deptId);
//        return Result.success();
//    }

    //第三种 推荐 删除前端绑定的请求变量名和后端方法接收形参一致 ，会自动接收 省略@RequestParam 特殊
    @DeleteMapping("/depts")
    public Result delete(Integer id) {
        log.info("删除部门id为:{} ", id);
        deptService.deleteById(id);
        return Result.success();
    }

    @PostMapping("/depts")
    public Result save(@RequestBody Dept dept) {
        System.out.println("保存部门名称为: " + dept);

        deptService.save(dept);
        log.info("保存部门名称为:{} ", dept);
        return Result.success();
    }

    @GetMapping("/depts/{id}")
    public Result queryById(@PathVariable("id") Integer deptId) {

        Dept dept = deptService.getInfo(deptId);
        log.info("查询id为 {} 的部门为 {}", dept, dept);
        return Result.success(dept);
    }

    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept) {

        deptService.update(dept);
        log.info("修改部门信息为：{}",dept);
        return Result.success();
    }
}

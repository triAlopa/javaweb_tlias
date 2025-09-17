package com.author.chen.controller;

import com.author.chen.pojo.Emp;
import com.author.chen.pojo.LoginInfo;
import com.author.chen.pojo.Result;
import com.author.chen.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private EmpService empService;

    @PostMapping()
    public Result login(@RequestBody Emp emp) {
        log.info("员工登录请求： {}", emp);

        LoginInfo loginInfo= empService.LoginRequest(emp);


        return loginInfo==null?Result.error("用户信息错误"):Result.success(loginInfo);
    }

}

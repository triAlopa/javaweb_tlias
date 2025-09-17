package com.author.chen.controller;

import com.author.chen.pojo.Result;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class cookieController {

    @GetMapping("/c1")
    public Result setCookie(HttpServletResponse response){

        response.addCookie(new Cookie("name","tom"));//设置Cookie/响应Cookie

       return Result.success();
    }
    @GetMapping("/c2")
    public Result getCookie(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("name")) log.info(cookie.getValue());//获取设置的cookie
        }

        return Result.success();
    }

    @GetMapping("/s1")
    public Result setSession(HttpSession session){
        session.setAttribute("age","18");

        return Result.success();
    }
    @GetMapping("/s2")
    public Result getSession(HttpSession session){

        Object age = session.getAttribute("age");
        log.info(" {} {}",session,age);

        return Result.success();
    }
}

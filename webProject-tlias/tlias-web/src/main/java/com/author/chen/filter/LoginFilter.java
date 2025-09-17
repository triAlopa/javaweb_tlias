package com.author.chen.filter;

import com.author.chen.utils.JwtUtils;
import io.jsonwebtoken.Jwts;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
//@WebFilter("/*") //拦截所有请求
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        //1.获取资源访问路径
        String URi = request.getRequestURI();

        //2.判断用户是否为登录请求
        if (URi.contains("/login")) {
            log.info("登录请求 放行");
            filterChain.doFilter(request, response);
            return;
        }
        //3，不是登录请求，校验 先获取token
        String token = request.getHeader("token");
        //4.如果token未定义或者不存在，则先前端响应401 并让用户先登录
        if(token==null||token.isEmpty()){
            log.info("用户没有登录呢~");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }

        //5.token存在，则解析判断 如果出错则判定令牌失效，返回401 让用户重新登录

        try {
            JwtUtils.parseJWT(token);
        }catch (Exception e){
            log.info("用户信息失效 或 受损，请重新登录");
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        //6.则校验用户token有效 证明在登录状态
        filterChain.doFilter(request, response);

    }
}

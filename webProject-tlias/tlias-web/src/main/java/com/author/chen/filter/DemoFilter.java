package com.author.chen.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
//@WebFilter("/*") // 拦截所有请求
public class DemoFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("DemoFilter init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        log.info("DemoFilter doFilter....");
        filterChain.doFilter(servletRequest, servletResponse);//放行
    }

    @Override
    public void destroy() {
        log.info("DemoFilter destroy");
    }
}

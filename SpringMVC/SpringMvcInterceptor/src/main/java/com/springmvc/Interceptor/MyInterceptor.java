package com.springmvc.Interceptor;


import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            /**
             * controller方法执行前，进行拦截的方法
             * return true放行
             * return false拦截
             * 可以使用转发或者重定向直接跳转到指定的页面。
             */
            System.out.println("preHandle方法执行了。。。");
            return false;
    }
}

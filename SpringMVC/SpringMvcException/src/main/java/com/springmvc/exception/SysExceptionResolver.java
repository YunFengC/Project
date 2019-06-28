package com.springmvc.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 配置异常处理器
 *
 */
public class SysExceptionResolver implements HandlerExceptionResolver {

    /**
     * 跳转到具体页面的方法
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @param e
     * @return
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {


        SysException sysException=null;
        //获取到异常对象
        if(e instanceof SysException){
             sysException  = (SysException) e;
        }else {
             sysException = new SysException("系统正在维护！！！");
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("sysException",sysException.getMessage());
        modelAndView.setViewName("error");

        return modelAndView;
    }
}

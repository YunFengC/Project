package com.springmvc.controller;



import com.springmvc.exception.SysException2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/User")
@Controller
public class ExceptionController {
    @RequestMapping("/exceptionTest")
    public String exceptionTest() throws SysException2 {
        System.out.println("exceptionTest执行了。。。");
        try {
            //制造异常
            int i = 10/0;
        } catch (Exception e) {
            //打印异常信息
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException2("查询所有出错!!!");
        }
        return "success";
    }
}

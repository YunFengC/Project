package com.springmvc.controller;


import com.springmvc.domain.Account;
import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(path = "/User")
public class HelloController{
    @RequestMapping(path = "/hello")
    public String helloController(){
        System.out.println("HelloController");
        return "HelloController";
    }
    @RequestMapping(path = "/RequestMappingTest")
    public String requestMappingTest(){
        System.out.println("RequestMapping启动了");
        return "HelloController";
    }
    @RequestMapping("/paramTest")
    public String paramTest(String username,int password){
        System.out.println("执行了。。。");
        System.out.println("UserName="+username+"PassWord="+password);
        return "HelloController";
    }
    @RequestMapping("/paramTest2")
    public String paramTest2(Account account){
        System.out.println(account);
        return "HelloController";
    }
    @RequestMapping("/paramTest3")
    public String paramTest3(Account account){
        System.out.println(account);
        return "HelloController";
    }
    @RequestMapping("/StringToDate")
    public String StringToDate(User user){
        System.out.println(user);
        return "HelloController";
    }
}
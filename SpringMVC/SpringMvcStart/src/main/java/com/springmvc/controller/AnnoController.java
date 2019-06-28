package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * SpringMvc注解的应用
 */
@Controller
@RequestMapping("/Anno")
public class AnnoController {

    //RequestParam注解
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam("name") String UserName){
        System.out.println(UserName);
        return "HelloController";
    }
    //RequestBody注解
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "HelloController";
    }
    //PathVariable注解
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String id){
        System.out.println(id);
        return "HelloController";
    }
    //RequestHeader注解
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Cookie") String cookie){
        System.out.println(cookie);
        return "HelloController";
    }
    //CookieValue注解
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String cookievalue){
        System.out.println(cookievalue);
        return "HelloController";
    }
    //ModelAttribute注解
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(User user){
        System.out.println(user);
        return "HelloController";
    }
    @ModelAttribute
    public User testModelAttribute2(String Name,String Age){
        User user = new User();
        user.setName(Name);
        user.setAge(Age);
        user.setDate(new Date());
        return user;
    }

    //SessionAttributes注解
    @RequestMapping("/testSessionAttributes")
    public String testSessionAttributes(Model model){
        model.addAttribute("msg","张三");
        return "HelloController";
    }
}

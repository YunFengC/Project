package com.springmvc.controller;

import com.springmvc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("/User")
@Controller
@SessionAttributes({"list"})
public class ResponseController {

    @RequestMapping("testString")
    public String testString(Model model){
        model.addAttribute("msg","张三");
        return "HelloResponse";
    }

    @RequestMapping("testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("请求转发,重定向");
        //请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/HelloResponse.jsp").forward(request,response);
        //重定向
        response.sendRedirect("/Login.jsp");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset:UTF-8");

    }

    @RequestMapping("testModelAndView")
    public ModelAndView testModelAndView(User user,Model model) throws IOException {

        ModelAndView modelAndView = new ModelAndView();
        System.out.println(user);
        List<User>list = new ArrayList<User>();
        list.add(user);
        model.addAttribute("list",list);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }

/*    @RequestMapping(value = "/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        user.setDate(new Date());
        System.out.println(user);
        return user;
    }*/
    @RequestMapping(value = "/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        user.setDate(new Date());
        System.out.println(user);
        return user;
    }
}

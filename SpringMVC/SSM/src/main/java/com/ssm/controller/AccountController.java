package com.ssm.controller;

import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
@Controller
@RequestMapping("/Account")
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Account> all = service.findAll();
        System.out.println(all);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",all);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }
    @RequestMapping("/save")
    public void save(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception {
        service.Save(account);
        response.sendRedirect(request.getContextPath()+"/Account/findAll");
        return;
    }
    @RequestMapping("/delete")
    public void delete(Account account, HttpServletResponse response, HttpServletRequest request) throws Exception {
        service.delete(account);
        response.sendRedirect(request.getContextPath()+"/Account/findAll");
        return;
    }
}

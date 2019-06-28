package com.maven.controller;


import com.maven.domain.Account;
import com.maven.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/Account")
@Controller
public class AccountController {

    @Autowired
    private AccountService service;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){

        List<Account> all = service.getAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list",all);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }


}

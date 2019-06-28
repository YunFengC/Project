package com.springboot.controller;

import com.springboot.dao.findAllDao;
import com.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class findAllController {

    @Autowired
    private findAllDao findAllDao;

    @RequestMapping("/findAll")
    public @ResponseBody List<User> findAll(){
        return findAllDao.getAll();
    }
}

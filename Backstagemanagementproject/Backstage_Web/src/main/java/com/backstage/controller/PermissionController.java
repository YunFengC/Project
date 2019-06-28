package com.backstage.controller;


import com.backstage.damain.Permission;
import com.backstage.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("/permission")
@Controller
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Permission> list = permissionService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("permissionList",list);
        modelAndView.setViewName("permission-list");
        return modelAndView;
    }
    @RequestMapping("/save")
    public void save(String permissionName, String url, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Permission permission = new Permission();
        permission.setPermissionName(permissionName);
        permission.setUrl(url);
        permissionService.save(permission);
        request.getRequestDispatcher("/permission/findAll.do").forward(request,response);
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String peid){
        Permission permission =  permissionService.findById(peid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("permission",permission);
        modelAndView.setViewName("permission-show");
        return modelAndView;
    }
    @RequestMapping("/deletePermission")
    public void deletePermission(String peid,HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {

        permissionService.deletePermission(peid);
        request.getRequestDispatcher("/permission/findAll.do").forward(request,response);
    }

}

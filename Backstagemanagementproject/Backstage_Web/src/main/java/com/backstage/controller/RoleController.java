package com.backstage.controller;

import com.backstage.damain.Permission;
import com.backstage.damain.Role;
import com.backstage.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@SessionAttributes({"role","permissionList"})
@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){

        List<Role> list = roleService.findAll();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("roleList",list);
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
    @RequestMapping("/save.do")
    public void save(Role role, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        roleService.save(role);
        request.getRequestDispatcher("/role/findAll.do").forward(request,response);
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String rid){
        Role role = roleService.findByPeId(rid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("role-show");
        modelAndView.addObject("role",role);
        return modelAndView;
    }
    @RequestMapping("/findUserByIdAndAllRole.do")
    public @ResponseBody String findUserByIdAndAllRole(String rid, Model model){

        List<Permission> byRId =  roleService.findByRId(rid);

        //判断Role是否有权限
        //如果Role没有权限就返回一个0并且跳转添加权限页面
        if (byRId.size()!=0){
            model.addAttribute("role",rid);
            model.addAttribute("permissionList",byRId);
            return "0";
        //如果Role有权限则告知用户
        }else{
            return "1";
        }
    }
    @RequestMapping("/addPermissionToRole.do")
    public void addPermissionToRole(String[] ids,String roleId,HttpServletResponse response,HttpServletRequest request) throws ServletException, IOException {

        for (String s : ids) {
           roleService.addPermissionToRole(s,roleId);
       }
        request.getRequestDispatcher("/role/findAll.do").forward(request,response);
    }
}

package com.backstage.controller;

import com.backstage.damain.Role;
import com.backstage.damain.UserInfo;
import com.backstage.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
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
@SessionAttributes({"roleList","user"})
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *查询所有用户
     * @return
     */
    @Secured({"ROLE_ADMIN"})
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<UserInfo> userList = userService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userList",userList);
        modelAndView.setViewName("user-list");
        return modelAndView;
    }

    /**
     * 根据用户ID查询该用户是否有Role权限
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/addByIdRoleName.do" ,produces = "text/html; charset=utf-8")
    public @ResponseBody String addByIdRoleName(String id, Model model){
        List<Role> list = userService.addByIdRoleName(id);
        UserInfo userInfo = userService.findUserId(id);
        if (list.size()==0){
            return "该用户已拥有所有权限,无需添加,请知悉！！！";
        }else{
            model.addAttribute("roleList",list);
            model.addAttribute("user",userInfo);
            return "请确认,前往权限添加页面。";
        }
    }

    /**
     * 给没有权限的用户添加权限
     * @param rid
     * @param uid
     * @return
     */
    @RequestMapping(value = "/addRoleToUser.do",produces = "text/html; charset=utf-8")
    public @ResponseBody String addRoleToUser(String[] rid ,String uid){

        if (rid[0].equals("on")){
            for (int i=1;i<rid.length;i++) {
                userService.addRoleToUser(rid[i], uid);
            }
        }else{
            for (String s : rid){
                userService.addRoleToUser(s, uid);
            }
        }

        return "添加成功";
    }

    /**
     * 新增用户
     * @param userInfo
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */

    @RequestMapping("/save.do")
    public void save(UserInfo userInfo, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userService.save(userInfo);
        request.getRequestDispatcher("/user/findAll.do").forward(request,response);
    }

    /**
     * 删除用户
     * @param uid
     * @return
     */
    @RequestMapping(value = "/delete.do",produces = "text/html; charset=utf-8")
    public @ResponseBody String delete(String[] uid){
        for (int i=0;i<uid.length;i++){
            userService.delete(uid[i]);
        }
        return "删除成功";
    }

    /**
     * 查看用户详情
     * @param uid
     * @return
     */
    @RequestMapping("/findById.do")
    public ModelAndView findById(String uid){
        UserInfo userInfo = userService.findById(uid);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",userInfo);
        modelAndView.setViewName("user-show");
        return modelAndView;
    }
}

package com.springmvc.controller;


import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@RequestMapping("/User")
@Controller
public class IntererceptorController {
    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor方法执行了！！！");
        return "HelloInterceptor";
    }
}
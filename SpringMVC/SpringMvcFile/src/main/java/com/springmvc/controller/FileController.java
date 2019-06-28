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
public class FileController {
    @RequestMapping("/fileupload")
    public String fileupload(HttpServletRequest request) throws Exception {
        //先获取到要上传的文件目录
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        //创建File对象,主要用于传数据
        File file = new File(realPath);
        //判断此路径是否存在
        if(!file.exists()){
            //如果不存在的话就创建此路径
            file.mkdirs();
        }
        //创建磁盘文件项工厂
        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        //解析Request对象
            List<FileItem> fileItems = servletFileUpload.parseRequest(request);
        //遍历fileItems
        for (FileItem item:fileItems) {
            //判断文件项是普通字段还是上传的文件
           if(!item.isFormField()){
               //上传文件项
               //获取到上传文件名称
               String name = item.getName();
               //上传文件
               item.write(new File(file,name));
               //删除临时文件
               item.delete();
           }else{

           }
        }
        return "HelloFile";
    }

    @RequestMapping("/fileupload2")
    public String fileupload2(HttpServletRequest request,MultipartFile upload) throws Exception {
        //先获取到要上传的文件目录
        String realPath = request.getSession().getServletContext().getRealPath("/uploads");
        //创建File对象,主要用于传数据
        File file = new File(realPath);
        //判断此路径是否存在
        if(!file.exists()){
            //如果不存在的话就创建此路径
            file.mkdirs();
        }
        //获得上传文件名称
        String originalFilename = upload.getOriginalFilename();
        //设置UUID唯一值
        String s = UUID.randomUUID().toString().replaceAll("_", " ").toUpperCase();
        originalFilename = s+"_"+originalFilename;
        //上传文件
        upload.transferTo(new File(file,originalFilename));
        return "HelloFile";
    }
}

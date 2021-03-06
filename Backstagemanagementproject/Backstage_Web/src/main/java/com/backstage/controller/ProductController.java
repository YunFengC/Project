package com.backstage.controller;


import com.backstage.damain.Product;
import com.backstage.service.ProductService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RequestMapping("/product")
@Controller
public class ProductController {
    
    @Autowired
    private ProductService service;

    /**
     * 分页查询所有的产品信息
     * @return
     */
    @RequestMapping("/getAll.do")
    public ModelAndView getALL(@RequestParam(name = "page", required = true, defaultValue = "1") Integer page, @RequestParam(name = "pageSize", required = true, defaultValue = "10") Integer pageSize){
        //获取商品列表
        List<Product> all = service.getAll(page,pageSize);
        //把查出来的集合交给分页插件处理
        PageInfo pageInfo = new PageInfo(all);
        ModelAndView modelAndView = new ModelAndView();
        //存入request作用域
        modelAndView.addObject("pageInfo",pageInfo);
        //设置跳转页面
        modelAndView.setViewName("product-list");
        return modelAndView;
    }

    /**
     * 添加商品
     * @param product
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @RequestMapping("/save.do")
    public void save(Product product, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //测试product是否接收到数据
        System.out.println(product);
        //添加数据
        service.save(product);
        //转发到商品列表
        request.getRequestDispatcher("/product/getAll.do").forward(request,response);
    }

    /**
     * 删除商品
     * @param id
     */
    @RequestMapping("/delete.do")
    public @ResponseBody String delete(String[] id) {

        //循环数组并依次删除
        if (id[0].equals("on")){
            for (int i=1;i<id.length;i++){
                service.delete(id[i]);
            }
        }else {
            for (int i=0;i<id.length;i++){
                System.out.println(id[i]);
                service.delete(id[i]);
            }
        }
        //返回Json数据
        return "成功删除";
    }

    /**
     * 局部刷新商品列表
     * @return
     */
    @RequestMapping(value = "/getAllajax.do")
    @ResponseBody
    public  List<Product> getAllajax(Integer page,Integer pageSize){
        List<Product> all = service.getAll(page,pageSize);
        //把查出来的集合交给分页插件处理
        PageInfo pageInfo = new PageInfo(all);

        return all;
    }
}

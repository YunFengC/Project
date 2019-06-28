package com.backstage.controller;


import com.backstage.damain.Orders;
import com.backstage.service.OrdersService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/getAll")
    public ModelAndView getAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "pageSize", required = true, defaultValue = "10") int pageSize){
        //获取到订单列表
        List<Orders> all = ordersService.getAll(page, pageSize);
        //把查出来的集合交给分页插件处理
        PageInfo pageInfo = new PageInfo(all);
        ModelAndView modelAndView = new ModelAndView();
        //存入到Request域中
        modelAndView.addObject("pageInfo",pageInfo);
        //遍历Orders测试
        for(Orders orders:all){
            System.out.println(orders);
        }
        //转发页面
        modelAndView.setViewName("orders-list");
        return modelAndView;
    }
    @RequestMapping("/findById.do")
    public ModelAndView findById(String id){
        //获取到orders对象
        Orders orders = ordersService.findById(id);
        //创建modelAndView对象
        ModelAndView modelAndView = new ModelAndView();
        //把orders存入到请求域中
        modelAndView.addObject("orders",orders);
        //转发页面
        modelAndView.setViewName("orders-show");
        return modelAndView;
    }

}

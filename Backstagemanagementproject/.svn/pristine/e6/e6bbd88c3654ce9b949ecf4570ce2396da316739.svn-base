package com.backstage.service.Impl;

import com.backstage.damain.Orders;
import com.backstage.dao.OrdersDao;
import com.backstage.service.OrdersService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    public Orders findById(String id) {
        return ordersDao.findById(id);
    }

    @Autowired
    private OrdersDao ordersDao;

    public List<Orders> getAll(int page, int pageSize) {
        //把参数交给PageHelper处理
        PageHelper.startPage(page,pageSize);
        return ordersDao.getAll();
    }
}

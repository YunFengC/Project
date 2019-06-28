package com.backstage.dao;

import com.backstage.damain.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao {
    /**
     * 查询所有订单
     * @return
     */
     List<Orders> getAll();
    /**
     * 根据ID查询详情信息
     * @param id
     * @return
     */
    Orders findById(String id);
}

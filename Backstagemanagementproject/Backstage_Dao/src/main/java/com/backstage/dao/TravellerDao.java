package com.backstage.dao;


import com.backstage.damain.Traveller;
import org.springframework.stereotype.Repository;

@Repository
public interface TravellerDao {

    /**
     * 查询订单项的商品信息
     * @param oid
     * @return
     */
    Traveller findById(String oid);

}

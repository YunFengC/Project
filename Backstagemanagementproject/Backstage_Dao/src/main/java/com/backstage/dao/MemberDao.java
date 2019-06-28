package com.backstage.dao;


import com.backstage.damain.Member;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {

    /**
     * 查询订单项的商品信息
     * @param oid
     * @return
     */
    Member findById(String oid);

}

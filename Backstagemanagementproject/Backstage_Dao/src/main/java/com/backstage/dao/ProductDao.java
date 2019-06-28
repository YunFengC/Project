package com.backstage.dao;

import com.backstage.damain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductDao {
    /**
     * 查询商品列表
     * @return
     */
    public List<Product> getAll();

    /**
     * 添加商品信息
     * @param product
     */
    void save(Product product);

    /**
     * 删除商品
     * @param id
     */
    void delete(String id);

}

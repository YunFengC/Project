package com.backstage.service;

import com.backstage.damain.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询商品列表
     * @return
     * @param page
     * @param pageSize
     */
    List<Product> getAll(int page, int pageSize);
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

package com.backstage.service.Impl;

import com.backstage.damain.Product;
import com.backstage.dao.ProductDao;
import com.backstage.service.ProductService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    public List<Product> getAll(int page, int pageSize) {
        //把参数交给PageHelper处理
        PageHelper.startPage(page,pageSize);
        return productDao.getAll();
    }

    public void save(Product product) {
        productDao.save(product);
    }

    public void delete(String id) {
        productDao.delete(id);
    }
}

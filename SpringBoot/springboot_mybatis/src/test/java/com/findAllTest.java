package com;

import com.springboot.SpringbootMybatisApplication;
import com.springboot.dao.findAllDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisApplication.class)
public class findAllTest {

    @Autowired
    private findAllDao findAllDao;

    @Test
    public void Test01(){
        System.out.println(findAllDao.getAll());
    }

}

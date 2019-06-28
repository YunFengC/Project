package com.springboot.dao;


import com.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface findAllDao {

    List<User> getAll();

}

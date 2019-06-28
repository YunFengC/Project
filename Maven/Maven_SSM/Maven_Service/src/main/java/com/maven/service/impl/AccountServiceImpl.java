package com.maven.service.impl;

import com.maven.dao.DaoMapper;
import com.maven.domain.Account;
import com.maven.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service("AccountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private DaoMapper daoMapper;

    @Override
    public List<Account> getAll() {
        return daoMapper.getAll();
    }
}

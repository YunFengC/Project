package com.ssm.service.serviceImpl;


import com.ssm.dao.AccountMapper;
import com.ssm.domain.Account;
import com.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
   private AccountMapper dao;
    @Override
    public List<Account> findAll() {
        List<Account> all = dao.findAll();
        System.out.println(all);
        return all;
    }
    @Override
    public void Save(Account account) {
        dao.Save(account);
    }

    @Override
    public void delete(Account account) {
        dao.delete(account);
    }
}

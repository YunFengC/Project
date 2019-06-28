package com.ssm.service;

import com.ssm.domain.Account;

import java.util.List;

public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存数据
     */
    public void Save(Account account);

    void delete(Account account);
}
